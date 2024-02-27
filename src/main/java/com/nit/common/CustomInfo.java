package com.nit.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component("custinfo")
@Setter
@ConfigurationProperties(prefix="cust.info")
public class CustomInfo {
	private String name;
	private Integer age;
	private String adress;
	private Float salery;
	
	@Override
	public String toString() {
		return "CustomInfo [name=" + name + ", age=" + age + ", adress=" + adress + ", salery=" + salery + "]";
	}
	
	

}
