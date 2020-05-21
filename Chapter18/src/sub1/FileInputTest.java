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
					
//					더이상 읽을 데이터가 없을 경우
					break;
					
				}
				char c = (char) value;
				System.out.print(c);
				
			}
			
			// Exception을 통합으로 쓰면 디테일한 예외사항을 알수가 없다 ex) 이름 나이 이메일 등등 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(" ");
		System.out.println("프로그램 종료..");
		//파일이 없을수도 잇으니깐 에러가 뜨는걸 방지하고자 try-catch를 한다
		
		
		
	}

}
