package sub4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		prop.setProperty("101", "서울");
		prop.setProperty("102", "대전");
		prop.setProperty("103", "대구");
		prop.setProperty("104", "부산");
		prop.setProperty("105", "제주도");
		
		System.out.println("101번째 데이터 : "+prop.getProperty("101"));
		
		System.out.println("101번째 데이터 : "+prop.getProperty("101"));
		
		
		//스트림을 통한 데이터입력
		String file = "C:\\Users\\bigdata\\Desktop\\country.properties";
		
		FileReader fr = new FileReader(file);

		Properties country = new Properties();
		country.load(fr);
		
		System.out.println("101번 나라 : "+country.getProperty("101"));
		
	}
	
}
