package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.common.CustomInfo;

@SpringBootApplication
public class SpringBootPro5OfLayeredApplication1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootPro5OfLayeredApplication1Application.class, args);
		CustomInfo ci=ctx.getBean("custinfo", CustomInfo.class);
		System.out.println(ci);
	}

}
