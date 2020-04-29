package lab8;
public class Monthly extends Appointment {
	public Monthly(String description, int day, int month, int year) {
		super(description, day, month, year);

	}
	public boolean occursOn(int day, int month, int year) {
		if(getDay() == day) {
			return true;
		}else {
			return false;
			
		}
	}
	
}
