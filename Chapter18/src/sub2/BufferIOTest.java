package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferIOTest {
public static void main(String[] args) throws Exception{
		
		String originfile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetfile = "C:\\Users\\bigdata\\Desktop\\sea2.jpg";
		
		
		
		//오리진파일이랑 연결
		FileInputStream fis = new FileInputStream(originfile);
		
		//타켓파일이랑 ㅇ연결
		FileOutputStream fos = new FileOutputStream(targetfile);
		
		
		// 버퍼스트림 생성 및 연결
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		int value = 0;
		
		
		while (true) {
			
			
				value = bis.read();
						
			
			if(value==-1) {
				break;
				
			}
			
			
			bos.write(value);
			
		}

		bis.close();
		bos.close();
		fis.close();
		fos.close();
		
		
		System.out.println("종료");
		
		
		
		
		
		
		
	}

}
