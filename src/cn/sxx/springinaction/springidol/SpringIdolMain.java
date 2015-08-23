package cn.sxx.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringIdolMain {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"cn/sxx/springinaction/springidol/spring-idol.xml");
		
		Performer performer = (Performer) context.getBean("duke");
		performer.perform();
	}
}
