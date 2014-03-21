package com.redbytes.model;

public class DataObject{
	String topic, desc, userValue;
	Boolean isRed;

	public DataObject(String topic, String desc, Boolean isRed){
		this.topic = topic;
		this.desc = desc;
		this.isRed = isRed;
		this.userValue= ""; 

	}


	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUserValue() {
		return userValue;
	}

	public void setUserValue(String userValue) {
		this.userValue = userValue;
	}

	public Boolean getIsRed() {
		return isRed;
	}

	public void setIsRed(Boolean isRed) {
		this.isRed = isRed;
	}




}
