package com.capgemini.spring_core_assign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.spring_core_assign.beans.MessageBean;
import com.capgemini.spring_core_assign.beans.UserBean;

@Configuration
public class MessageConfig {
	
	@Bean
	public MessageBean getMessageBean() {
		MessageBean messageBean=new MessageBean();
		messageBean.setMessage("Assignment Started");
		messageBean.setUserBean(getUserBean());
		
		return messageBean;
	}
	
	@Bean
	public UserBean getUserBean() {
		
		UserBean userBean=new UserBean();
		userBean.setId(101);
		userBean.setMessage("Assignment Completed");
		return userBean;
		
	}
	
}
