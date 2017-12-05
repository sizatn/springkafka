package com.sizatn.springkafka.start;

import java.io.FileNotFoundException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

public class start {

	static {
		try {
			Log4jConfigurer.initLogging("classpath:config/log4j.xml");
		} catch (FileNotFoundException ex) {
			System.err.println("加载log4j配置失败" + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			context.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
