package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		
		try {
			FileInputStream fis = new FileInputStream(file);
			int value = 0;
			while(true) {
				
				value = fis.read();
				
				
				if(value == -1) {
					
//					���̻� ���� �����Ͱ� ���� ���
					break;
					
				}
				char c = (char) value;
				System.out.print(c);
				
			}
			
			// Exception�� �������� ���� �������� ���ܻ����� �˼��� ���� ex) �̸� ���� �̸��� ��� 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(" ");
		System.out.println("���α׷� ����..");
		//������ �������� �����ϱ� ������ �ߴ°� �����ϰ��� try-catch�� �Ѵ�
		
		
		
	}

}
