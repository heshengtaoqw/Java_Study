package sxt8.commonObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;




public class CommonTime {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		Date date0 = new Date();
		System.out.println(date0);
		long time0 = date0.getTime();
		Date date1 = new Date(time0 + 1000);
		Date date2 = new Date(time0 - 1000);
		System.out.println(date0.before(date1));
		System.out.println(date0.before(date2));
		System.out.println(date0.after(date1));
		System.out.println(date0.after(date2));
		
		
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(s1.format(new Date()));
		System.out.println(s2.format(new Date()));
		SimpleDateFormat s3 = new SimpleDateFormat("D");
		SimpleDateFormat s4 = new SimpleDateFormat("H");
		System.out.println(s3.format(new Date()));
		System.out.println(s4.format(new Date()));

		CommonTime ct = new CommonTime();
		ct.testCalendar();
		
	}
	

/*
 *  Calendar 类是一个抽象类，为我们提供了关于日期计算的相关功能，比如：年、月、日、时、分、秒的展示和计算。
    GregorianCalendar 是 Calendar 的一个具体子类，提供了世界上大多数国家/地区使用的标准日历系统。
 */
	public void testCalendar() {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		calendar.set(2020, 2, 29, 23, 56);
		System.out.println(calendar.getTime());
		
	}
}
