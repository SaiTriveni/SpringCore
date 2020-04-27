package com.capgemini.spring_core_assign.beans;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class MessageBean {

private String message;

@Autowired
private UserBean userBean;
	
}
