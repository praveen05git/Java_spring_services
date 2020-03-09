package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		CoachInterface CoachObj=context.getBean("BaseballCoachBean",CoachInterface.class);
		
		System.out.println(CoachObj.getDailyWorkout());
		System.out.println(CoachObj.getDailyFortune());
	}

}
