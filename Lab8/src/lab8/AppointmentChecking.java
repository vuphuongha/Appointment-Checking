package lab8;
import java.util.ArrayList;

public class AppointmentChecking {
	ArrayList<Appointment> appointments;

	public AppointmentChecking(){
		appointments = new ArrayList<Appointment>();
	}
	public void addAppointment(Appointment a) {
		appointments.add(a);

	}
	public void find(int day, int month, int year) {
		for (Appointment a: appointments) {
			if(a.occursOn(toString(),  day,  month,  year)) {
				System.out.println(a.getDescription());								
			}
			}
	}			
}