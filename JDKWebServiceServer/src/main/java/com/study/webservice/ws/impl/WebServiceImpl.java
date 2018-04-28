package com.study.webservice.ws.impl;

import javax.jws.WebService;

import com.study.webservice.ws.IWebService;

/**
 * 编写接口的实现类，使用@WebService注解标注实现类，实现接口中定义的所有方法
 *
 */
//使用@WebService注解标注IWebService接口的实现类WebServiceImpl
@WebService
public class WebServiceImpl implements IWebService {

	@Override
	public String sayHello(String name) {
		System.out.println("WebService sayHello "+name);
        return "sayHello "+name;
	}

	@Override
	public String save(String name, String pwd) {
		System.out.println("WebService save "+name+"， "+pwd);
        return "save Success";
	}

}
