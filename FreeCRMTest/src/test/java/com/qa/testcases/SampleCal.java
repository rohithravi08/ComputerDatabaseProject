package com.qa.testcases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SampleCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try { 
			Calendar cal = Calendar.getInstance(); 
			cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2018-05-20")); 
			SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
			System.out.println(sdf.format(cal.getTime())); 
			} catch (ParseException e) 
			{ e.printStackTrace(); }
	}

}
