package sub5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("date : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss");
		String now = sdf.format(date);
		System.out.println("now : "+now);
		
	}

}
