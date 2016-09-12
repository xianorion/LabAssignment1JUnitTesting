package date;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTests {

	@Test
	public void daysInSameMonthThreeDaysApartReturnsThree() {
		Date d1= new Date(2009 , 12, 25);
		Date d2= new Date(2009, 12 ,28);
		
		assertEquals("Should display 3 for dates 3 days apart", 5, d1.daysTo(d2));
	}
	
	
	@Test
	public void daysInTwoDifferentMonthsFiveDaysApartReturnsFive() {
		Date d1= new Date(2016 , 9, 28);
		Date d2= new Date(2016, 10 ,3);
		
		assertEquals("Should display 5 for dates 5 days apart", 5, d1.daysTo(d2));
	}
	
	@Test
	public void daysInTwoDifferentMonthsAndYearsThatAre378DaysApartReturns378(){
		Date d1 = new Date(2015, 2, 20);
		Date d2 = new Date(2016, 3, 3);
		
		assertEquals("Should display 378 for dates 378 days apart",378, d1.daysTo(d2));
	}
	
	@Test 
	public void daysThatAreInTheSameMonthBut2YearsApartReturns730(){
		Date d1 =  new Date(2010 , 4, 30);
		Date d2 = new Date(2012 , 4 ,30);
		
		assertEquals("Should display 730 for dates 730 days apart",730, d1.daysTo(d2));
		
	}
	
	@Test
	public void dateThatIs1Year2MonthsAnd6DaysAfterSecondDateReturns431(){
		Date d1 = new Date(2011, 8, 12);
		Date d2 = new Date(2010, 6, 6);
		
		assertEquals("Should display 431 for dates 431 days apart",431, d1.daysTo(d2));
	}
	
	@Test
	public void timeBetweenSameDateReturnsZero(){
		Date d1 = new Date(2016, 10,25);
		Date d2 =  new Date(2016, 10,25);
		
		assertEquals("Should display 0 for same date", 0 , d1.daysTo(d2));
	}
	

}
