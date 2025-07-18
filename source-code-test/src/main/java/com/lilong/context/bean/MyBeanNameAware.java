package com.lilong.context.bean;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author : lilong
 * @date : 2025-07-18 20:59
 * @description :
 */
public class MyBeanNameAware implements BeanNameAware {

	private String beanName;

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}


	public void show(){
		System.out.println("beanName:"+beanName);
	}
}
