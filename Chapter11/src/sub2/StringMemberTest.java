package sub2;

/*
 *  String 멤버 실습
 * 
 * 
 */
public class StringMemberTest {
	public static void main(String[] args) {
		String str = "Hello Korea";
		
		// length = 문자갯수
		System.out.println("str 문자열 길이 : " +str.length());
		
		// charAt - 문자열에서 특정문자 추출
		System.out.println("str 6번째 문자 : " +str.charAt(6));
		
		
		// substring - 
		System.out.println("str 0번째에서 5번까지의 문자열 : " +str.substring(0, 5));
		System.out.println("str 0번째에서 5번까지의 문자열 : " +str.substring(6));
		
		
		// indexOf -앞에서 인덱스값
		// lastIndexOf - 뒤에서부터 인덱스값
		System.out.println("str 문자열 길이 : " +str.indexOf("o"));
		System.out.println("str 문자열 길이 : " +str.lastIndexOf("o"));
		
		
		// replace
		System.out.println("str 문자열 길이 : " +str.replace("H", "e"));

		
		// valueOf
		int var1 = 1;
		double var2 = 2.12;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1); 
		String s2 = String.valueOf(var2); 
		String s3 = ""+var3; 
//		String s3 = var3;
		
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
//		System.out.println("str 문자열 길이 : " +str.valueOf(true));

	}

}
