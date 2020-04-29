package lab8;

public class Appointment {	

	public String description;
	public int day;
	public int month;
	public int year;
	
    public Appointment (String description, int day, int month, int year) {
    	this.description = description;
    	this.day = day;
    	this.month = month;
    	this.year = year;
    }
    public boolean occursOn(int day, int month, int year) {
    	if(getDay() == day && getMonth() == month && getYear() == year) {
    		return true;
    	}else {
    		return false;
    		
    	}
    }
    public String getDescription() {
    	return description;
    	
    }
    public void setDescription(String description) {
    	this.description = description;
    	
    }
    public int getDay() {
    	return day;
   
    }
    public void setDay(int day) {
    	this.day = day;
    	
    }
    public int getMonth() {
    	return month;
    	
    }
    public void setMonth(int month) {
    	this.month = month;
    	
    }
    public int getYear() {
    	return year;
    	
    }
    public void setYear(int year) {
    	this.year = year;
    }
}
    
    
    

    
