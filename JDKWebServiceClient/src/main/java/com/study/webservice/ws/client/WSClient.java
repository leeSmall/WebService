package com.study.webservice.ws.client;

import com.study.webservice.ws.impl.WebServiceImpl;
import com.study.webservice.ws.impl.WebServiceImplService;

/**
 * 调用WebService的客户端
 *
 */
public class WSClient {
	public static void main(String[] args) {
        //创建一个用于产生WebServiceImpl实例的工厂，WebServiceImplService类是wsimport工具生成的
        WebServiceImplService factory = new WebServiceImplService();
        //通过工厂生成一个WebServiceImpl实例，WebServiceImpl是wsimport工具生成的
        WebServiceImpl wsImpl = factory.getWebServiceImplPort();
        //调用WebService的sayHello方法
        String resResult = wsImpl.sayHello("小不点");
        System.out.println("调用WebService的sayHello方法返回的结果是："+resResult);
        System.out.println("---------------------------------------------------");
        //调用WebService的save方法
        resResult = wsImpl.save("小不点","123");
        System.out.println("调用WebService的save方法返回的结果是："+resResult);
    }
}
