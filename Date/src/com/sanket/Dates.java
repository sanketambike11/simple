package com.sanket;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Dates {
	
	public void displayDate()
	{
	
	LocalDate localdate = LocalDate.now();
	LocalTime localtime = LocalTime.of(12, 33);
	LocalDateTime localdatetime = LocalDateTime.now();
    OffsetDateTime offsetDateTime = OffsetDateTime.now();
    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
    System.out.println(localdate);
    System.out.println(offsetDateTime);
    System.out.println(zonedDateTime);
    
	
	
	}
}
