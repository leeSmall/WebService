package com.study.webservice.ws.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.study.webservice.ws.IWebService;

/**
 * 使用CXF的JaxWsProxyFactoryBean调用WebService的服务端
 *
 */
public class WSClient {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
        jwpfb.setServiceClass(IWebService.class);
        String address = "http://192.168.152.1:8989/WS_Server/Webservice";
        jwpfb.setAddress(address);
        IWebService hs = (IWebService) jwpfb.create();
        //调用WebService的sayHello方法
        String resResult = hs.sayHello("小不点");
        System.out.println("调用WebService的sayHello方法返回的结果是："+resResult);
        System.out.println("---------------------------------------------------");
        //调用WebService的save方法
        resResult = hs.save("小不点","123");
        System.out.println("调用WebService的save方法返回的结果是："+resResult);
    }
}
