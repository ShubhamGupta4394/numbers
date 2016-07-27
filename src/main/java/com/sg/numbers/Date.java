package com.sg.numbers;

import java.time.Year;

public class Date {
	private int day, month, year, minute, hour, second,amount;
	
//	private static MONTHS = {31,}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public boolean leapyear(int year) {
		int yr;
		yr = year;
		boolean a = ((yr % 4 == 0) && (yr % 100 != 0) || (yr % 400 == 0));
		return a;
	}

	private int daysinmonth(int mnth, int yr) {
		int days=0;
		int month = this.getMonth();
		int year = this.getYear();
		if (month == 2 && leapyear(year)) {
			days=29;
		}
		if (month == 2) {
			days=28;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days=31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			days=30;
		}
		return days;
	}
	public Date adddays(int amount)
    {
        this.amount = amount;
        return adddays(this.day + this.amount, this.month, this.year);
    }
	private Date adddays(int days,int month,int year) {
		if (days >= 0 && days <= daysinmonth(month, year)) {
			return new Date(days,month,year);
		} 
		else {
			month=month+1;
			if(month>12)
			{
				month=1;
				year=year+1;
			}
			days=days-daysinmonth(month, year) ;
        }
		return adddays(days,month,year);
	}
	public Date addyears(int years)
	{
		this.year+=years;
		Date d1 = new Date(this.day,this.month,this.year);
		return d1;
	}
	public Date addmonths(int months)
	{
		int m,a;
		m=this.month+months;
		a=m/12;
		this.year+=a;
		int b=m%12;
		this.month=b;
		Date d3 = new Date(day,month,year);
		return d3;
	}
	public Date addweeks(int weeks)
	{
		int days = weeks*7;
		return adddays(days, this.month, this.year);
	}
}
