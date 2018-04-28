package com.study.webservice.ws;

import javax.jws.WebService;

/**
 * 定义一个接口，使用@WebService注解标注接口
 *
 */
//使用@WebService注解标注IWebService接口
@WebService
public interface IWebService {

    String sayHello(String name);
    
    String save(String name,String pwd);
}
