package com.truman.trippy.helper;

public class TripFeedHelper {
    static String[] monthArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	public static String getMonthNameFromNumber(Integer monthNumber) {
	    return monthArray[monthNumber];
	}
}
