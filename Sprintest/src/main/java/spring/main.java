package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
	private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context=new ClassPathXmlApplicationContext("beans.xml");
		hello hello=(hello) context.getBean("Hello");
		hello.say();
	}
}
