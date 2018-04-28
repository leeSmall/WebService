package com.study.webservice.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 定义一个接口，使用@WebService注解标注接口，使用@WebMethod注解标注接口中定义的所有方法
 *
 */
//使用@WebService注解标注IWebService接口
@WebService
public interface IWebService {

	//使用@WebMethod注解标注IWebService接口中的方法
    @WebMethod
    String sayHello(String name);
    
    @WebMethod
    String save(String name,String pwd);
}
