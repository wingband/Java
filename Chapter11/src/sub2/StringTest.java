package sub2;

/*
 * 
 * String 클래스 실습하기 교재
 * 
 * 
 * String 클래스
 * - 문자열을 저장하는 데이타 타입
 * - 문자열 저장은 배열과 같은 구조를 같는다
 * - 문자열 비교는 equals 매서드를 호출한다.
 */
public class StringTest {
	public static void main(String[] args) {
		
		//문자열 = 문자 + 배열
		String str = "Hello";
		char[] arr = {'H','e','l','l','o'};
		
		System.out.println(str);
		System.out.println(arr);
		
		
		//문자열 객체생성
		String str1 = new String("Hello!");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello"; // literal 생성
		
		if(str1 == str2) {
			System.out.println("str1 과 str2가 주소값이 같다");
		}else {
			System.out.println("str1 과 str2가 주소값이 다르다");
		}
		if(str3 == str4) {
			System.out.println("str1 과 str2가 주소값이 같다");
		}else {
			System.out.println("str1 과 str2가 주소값이 다르다");
		}
		
		//문자열 비교
		if(str2.contentEquals(str4)) {
			System.out.println("str1 과 str3가 문자열이 같다");
		}else {
			System.out.println("str1 과 str3가 문자열이 다르다");
		}
		
		
		
	}

}
