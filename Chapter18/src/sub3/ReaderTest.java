package sub3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	 public static void main(String[] args) throws IOException{
		
		 String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		 
		 FileReader fr = new FileReader(file);
		 int value = 0;
		 
		 while(true) {
			
				value = fr.read();
			
			
			if(value==-1) {
				break;
			}
			char c = (char) value;
			System.out.print(c);
			
			
		 }
	}
	

}
