package lab8;
import java.util.Scanner;

public class TesterAppointment {
	
	public static void main(String[] args) {
		AppointmentChecking list = new AppointmentChecking();
		list.addAppointment(new Monthly ("Blood Pressure Check", 9,10,2020));
		list.addAppointment(new Monthly("Hang out with Percy", 2,11,2019));
		list.addAppointment(new Daily ("Visit to grandma", 12,8,2020));
		list.addAppointment(new OneTime ("Dentist", 20,6,2020));
		
		Scanner sc = new Scanner(System.in);
		
		int dayinput = 0;
		int monthinput = 0;
		int yearinput = 0;
		
		boolean correctdate = false;
		while(!correctdate) {
			System.out.print("Enter a date (like 2015 10 31): ");
			yearinput = sc.nextInt();
			monthinput = sc.nextInt();
			dayinput = sc.nextInt();
			
			if(monthinput>=1 && monthinput<=12&& dayinput >=1 && dayinput<=31) {
				correctdate = true;
		//	}else if (monthinput==(2 * monthinput +1) && monthinput== 8 && monthinput==10&& monthinput==12) {
		//		correctdate = dayinput>=1 && dayinput<=31;
		//	}else if (monthinput == 4 && monthinput == 6 && monthinput == 9 && monthinput == 11) {
		//		correctdate = dayinput >=1 && dayinput < 30;
		//	}
			if(!correctdate) {
				System.out.println("Invalid date");
			}
		}
		System.out.println("You have the following appointments on " + dayinput + "/" + monthinput + "/" + yearinput + ":");
		list.find(dayinput, monthinput,  yearinput);
	}
}
}