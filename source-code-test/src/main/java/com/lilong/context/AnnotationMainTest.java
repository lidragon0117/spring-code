package com.lilong.context;


import com.lilong.context.bean.Person;
import com.lilong.context.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解版Spring的用法
 */
public class AnnotationMainTest {

	public static void main(String[] args) {
//		new ClassPathXmlApplicationContext()

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext();
		Person bean = applicationContext.getBean(Person.class);

		ApplicationContext context = bean.getContext();

		System.out.println(context == applicationContext);
	}
}
