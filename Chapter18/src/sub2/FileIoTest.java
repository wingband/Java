package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIoTest {
	public static void main(String[] args) throws FileNotFoundException{
		
		String originfile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetfile = "C:\\Users\\bigdata\\Desktop\\sea2.jpg";
		
		//�����������̶� ����
		FileInputStream fis = new FileInputStream(originfile);
		
		//Ÿ�������̶� ������
		FileOutputStream fos = new FileOutputStream(targetfile);
		
		int value = 0;
		
		while (true) {
			
			try {
				value = fis.read();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			if(value==-1) {
				break;
				
			}
			
			try {
				fos.write(value);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
