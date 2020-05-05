package lab8;

public class Daily extends Appointment{
	public Daily(String description, int day, int month, int year) {
		super(description, day, month, year);

	}

	@Override
	boolean occursOn(String description, int day, int month, int year) {
		// TODO Auto-generated method stub
		return true;
	}
}
