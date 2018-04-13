import java.util.*;
import java.io.*;
import java.awt.*; 
import javax.swing.*; 
import java.time.*;
import java.time.temporal.*;
public class DaysGuide {
	public static void main(String []args) {
		LocalDate today = LocalDate.now();    

		String string = new String (today.getDayOfMonth() + " " + today.getMonth() + " " + today.getYear());

		LocalDate plus = today.plus(Period.ofDays(100));  

		LocalDate minus = today.minus(Period.ofDays(100));

		LocalDate tomorrow = today.plusDays(2);

		LocalDate yesterday = tomorrow.minusDays(2);

		Period p = Period.between(today, tomorrow);

		long p2 = ChronoUnit.DAYS.between(today, tomorrow);

		LocalDate a = LocalDate.of(2014, 6, 30);

		LocalDateTime b = a.atTime(2,22,58);  /*LocalDateTime b = a.atTime(int hour,   int minute,   int second)*/

		/**/LocalDate bday = LocalDate.parse("2019-05-13");  /*IMPORTANT*/    /*Remember to put a 0 if number is 2 digits */

		/*OR  LocalDate bday = LocalDate.of(2019, Month.MAY, 13); */

		Period tc = Period.between(a, today);

		LocalDateTime nTime = LocalDateTime.now();

		System.out.println(nTime.getHour() + " " + nTime.getMinute() + " " + nTime.getSecond());  /*The hour, minute, and second EX: 9 15 30 */

		System.out.println(today.lengthOfMonth()); /*How many days are in this month */

		System.out.println(today.getDayOfMonth() + " " + today.getMonth() + " " + today.getYear()); /* The Day, Month(written in letter form), and Year currently. EX: 13 APRIL 2018 */
		
		System.out.println(tc.getDays() + " " + tc.getMonths() + " " + tc.getYears());  /* The Day, Month(written in number form), and Year currently EX: 13 4 2018 */
	}
}
