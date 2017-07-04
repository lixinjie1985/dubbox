package org.eop.dubbox.test;

import org.eop.dubbox.component.PostComponent;
import org.eop.dubbox.service.rest.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lixinjie
 * @since 
 */
public class TestConsumer1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		UserService userService = (UserService)context.getBean("userService");
		System.out.println(userService.getUser("1111", "李新杰", "男", 32));
		PostComponent postCmp = context.getBean(PostComponent.class);
		System.out.println(postCmp.getCmp("2222", "李新杰"));
	}

}
