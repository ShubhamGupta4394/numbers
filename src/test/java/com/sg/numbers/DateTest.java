package com.sg.numbers;

import com.sg.numbers.Date;

import junit.framework.TestCase;

public class DateTest extends TestCase {
 public void testadddays()
 {
	 Date d = new Date(4,3,1995);
	 Date d1= d.adddays(64);
	 assertEquals(6,d1.getDay());
	 assertEquals(5,d1.getMonth());
	 assertEquals(1995,d1.getYear());
 }
 public void testaddyears()
 {
	 Date d2 = new Date(4,3,1995);
	 Date d3 = d2.addyears(10);
	 assertEquals(2005,d3.getYear());
 }
 public void testaddmonths()
 {
	 Date d4 = new Date(4,3,1995);
	 Date d5 = d4.addmonths(38);
	 assertEquals(5,d5.getMonth());
	 assertEquals(1998, d5.getYear());
 }
 public void testaddweeks()
 {
	 Date d6 = new Date(4,3,1995);
	 Date d7 = d6.addweeks(4);
	 //assertEquals(expected, actual);;
 }
}
