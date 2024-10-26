package com.lilong.context;

import com.lilong.context.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


//https://gitee.com/leifengyang/spring-framework
public class MainTest {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);

	}
}
