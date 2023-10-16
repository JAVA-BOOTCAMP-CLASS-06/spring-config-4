package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.MessageBean;
import bo.SampleBO;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		SampleBO bo = ac.getBean(SampleBO.class);
		
		MessageBean msg = bo.processData();
		
		System.out.println(msg);
		
		ac.close();
	}

}
