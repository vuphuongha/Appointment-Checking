package lab8;

public class TesterAppointment {
	
	public static void main(String[] args) {
		AppointmentChecking list = new AppointmentChecking();
		list.addAppointment(new Monthly ("Blood Pressure Check", 9,10,2020));
		list.addAppointment(new Monthly("Hang out with Percy", 2,11,2019));
		list.addAppointment(new Daily ("Visit to grandma", 12,8,2020));
		list.addAppointment(new OneTime ("Dentist", 20,6,2020));
		
		int dayinput = 9;
		int monthinput = 7;
		int yearinput = 2019;
		
		System.out.println("Enter a date (like 2015 10 31): " + dayinput + "/" + monthinput + "/" + yearinput);
		System.out.println("You have the following appointments on " + dayinput + "/" + monthinput + "/" + yearinput + ":");
		list.find(dayinput, monthinput, yearinput);
	}
	
}