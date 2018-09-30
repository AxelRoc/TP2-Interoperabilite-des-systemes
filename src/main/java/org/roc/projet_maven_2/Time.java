package org.roc.projet_maven_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Time {
	
	public static Instant parseDatetimestamp(String literal) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
		Date date = formatter.parse(literal);
		Instant instant = date.toInstant();
		return instant;		
	}
	
	public static String serializeDatetimeStamp (Instant instant) {
		return(instant.toString());
	}
	
	public static void main(String args[]) throws ParseException {
		System.out.println(parseDatetimestamp("2018-09-18T23:42:00+0500"));
		System.out.println(serializeDatetimeStamp(parseDatetimestamp("2018-09-18T23:42:00+0500")));
	}
	
}
