package sub4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		prop.setProperty("101", "����");
		prop.setProperty("102", "����");
		prop.setProperty("103", "�뱸");
		prop.setProperty("104", "�λ�");
		prop.setProperty("105", "���ֵ�");
		
		System.out.println("101��° ������ : "+prop.getProperty("101"));
		
		System.out.println("101��° ������ : "+prop.getProperty("101"));
		
		
		//��Ʈ���� ���� �������Է�
		String file = "C:\\Users\\bigdata\\Desktop\\country.properties";
		
		FileReader fr = new FileReader(file);

		Properties country = new Properties();
		country.load(fr);
		
		System.out.println("101�� ���� : "+country.getProperty("101"));
		
	}
	
}
