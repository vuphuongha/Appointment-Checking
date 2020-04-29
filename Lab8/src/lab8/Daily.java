package lab8;

public class Daily extends Appointment{
	public Daily(String description, int day, int month, int year) {
		super(description, day, month, year);

	}
	public boolean occursOn(int day, int mon, int year) {
		return true;
	}
}
