package sub5;

import java.util.Calendar;

//Calendar Ŭ���� �ǽ�
public class CalendarTest {
	public static void main(String[] args) {
		
//		�̱��水ü
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d�� %d�� %d�� \n", year, month, date);
		System.out.printf("%d�� %d�� %d�� \n", hour, min, sec);
		
		
	}
}
