package date;
import java.util.*;
import static java.lang.Math.*;

public class Date {
	private static final int DAYS_IN_A_MONTH = 30;
	private static final int DAYS_IN_A_YEAR = 365;
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
		daysApart = abs(yearsBetween*DAYS_IN_A_YEAR+monthsBetween*DAYS_IN_A_MONTH + daysBetween);
		
		return daysApart;
	}
	
}
