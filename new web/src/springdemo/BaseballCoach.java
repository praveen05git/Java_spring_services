package springdemo;

public class BaseballCoach implements CoachInterface{
	
	private FortuneServiceInterface fortuneService;
	
	public BaseballCoach(FortuneServiceInterface theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Baseball batting";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

}
