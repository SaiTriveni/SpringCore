package com.capgemini.spring_core_assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.spring_core_assign.beans.MessageBean;
import com.capgemini.spring_core_assign.config.MessageConfig;

public class MessageTest {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean messageBean=context.getBean(MessageBean.class);
		System.out.println(messageBean.getMessage());
		System.out.println("-----------------");
		System.out.println(messageBean.getUserBean().getId());
		System.out.println(messageBean.getUserBean().getMessage());
	}
	
	
	
	
}
