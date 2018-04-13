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
	// System.out.println(a.getDayOfWeek()); 
    LocalDateTime b = a.atTime(2,22,58);  /*LocalDateTime b = a.atTime(int hour,   int minute,   int second)*/
/**/LocalDate bday = LocalDate.parse("2019-05-13");  /*IMPORTANT*/    /*Remember to put a 0 if number is 2 digits*/ /*
OR*/LocalDate bday = LocalDate.of(2019, Month.MAY, 13);
    Period tc = Period.between(a, today);
    LocalDateTime nTime = LocalDateTime.now();
	System.out.println(nTime.getHour() + " " + nTime.getMinute() + " " + nTime.getSecond());
    System.out.println(today.lengthOfMonth());
    System.out.println(today.getDayOfMonth() + " " + today.getMonth() + " " + today.getYear()); /* 1 -->FEBRUARY<-- 2018 */
    System.out.println(today.lengthOfMonth());
    System.out.println(tc.getYears() + " " + tc.getMonths() + " " + tc.getDays());
    System.out.println(b.getHour() +  " " + b.getMinute() + " " + b.getSecond());
    // System.out.println(plus);
}
}

/* import java.util.*;
import java.io.*;
import java.awt.*; 
import javax.swing.*; 
public class Date {
public static void main(String []args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Birth Month:");
	int month = input.nextInt();
	System.out.println("Birth Day:");
	int day = input.nextInt();
	System.out.println("Birth Year:");
	int year = input.nextInt();
	Calendar now = Calendar.getInstance();
	int yearAge = (now.get(Calendar.YEAR) - year);
	int monthAge = (now.get(Calendar.MONTH) + 1 - month);
	int dayAge = (now.get(Calendar.DATE) - day);
	// int age = (yearAge + monthAge + dayAge);
	if(monthAge != 0){
		yearAge --;
		monthAge += 12;
	}
System.out.println(yearAge + " Years " + monthAge + " Months " + dayAge + " Days ");
	}
}
*/