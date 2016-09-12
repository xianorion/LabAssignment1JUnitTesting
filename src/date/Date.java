package date;
import java.util.*;
import java.lang.*;

public class Date {
	private int year;
	private int month;
	private int day;

	public Date(int year, int month, int day){
		this.year =year;
		this.month = month;
		this.day = day;
	}
	
	public int daysTo(Date anotherDate){
		int daysApart = 0;
		int daysBetween = 0, monthsBetween = 0, yearsBetween = 0;

		yearsBetween = (this.year - anotherDate.year);
		monthsBetween = (this.month - anotherDate.month);
		daysBetween = (this.day - anotherDate.day);
		daysApart = abs(yearsBetween*365+monthsBetween*30 + daysBetween);
		
		return daysApart;
	}

	private int abs(int i) {
		if (i <0 )
			return ((-1)*i);
		else
			return i;
	}
	
	
}
