package com.capgemini.spring_core_assign.beans;

import lombok.Data;


public class Message {
	
  private String Message;
  private User user;
  
public String getMessage() {
	return Message;
}
public void setMessage(String message) {
	Message = message;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
  
  
	
}
