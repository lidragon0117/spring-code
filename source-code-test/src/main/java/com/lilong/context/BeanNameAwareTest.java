package com.lilong.context;

import com.lilong.context.bean.MyBeanNameAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : lilong
 * @date : 2025-07-18 21:01
 * @description :
 */
public class BeanNameAwareTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyBeanNameAware bean = context.getBean(MyBeanNameAware.class);
		bean.show();
	}
}
