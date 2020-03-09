package springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		CoachInterface InterObj=new TrackCoach();
		
		System.out.println(InterObj.getDailyWorkout().toString());
			

	}

}
