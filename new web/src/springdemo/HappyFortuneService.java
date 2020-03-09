package springdemo;

public class HappyFortuneService implements FortuneServiceInterface {

	@Override
	public String getDailyFortune() {
		
			return "Have a great day!";
	}

}
