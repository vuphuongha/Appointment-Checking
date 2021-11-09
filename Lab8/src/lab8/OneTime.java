package lab8;

public class OneTime extends Appointment {
	public OneTime(String description, int day, int month, int year) {
		super(description, day, month, year);

	}

	@Override
	boolean occursOn(String description, int day, int month, int year) {
		return false;
	}
}
