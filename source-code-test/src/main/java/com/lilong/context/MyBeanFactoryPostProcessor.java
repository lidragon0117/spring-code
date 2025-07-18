package com.lilong.context;

import com.lilong.context.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author : lilong
 * @date : 2025-07-18 20:36
 * @description :   PostProcessor 后置处理器增强器
 * 这个是对Bean的后置处理器增强
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition person = beanFactory.getBeanDefinition("person");
		// 可以对Bean进行自定义修改
		System.out.println("through the BeanFactoryPostProcessor handle the BeanDefinition Object");
	}
}
