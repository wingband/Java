package sub1;


/*
 * 20200504
 * 임진욱
 * 자바 배열 기초 실습
 * 
 */

public class ArrayTest {
	public static void main(String[] args) {
		
		//변수
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
		
		//배열
		int num[] = {1,2,3,4,5};
		int i;
		System.out.println("배열 nums의 1번째 원소 : "+num[0]);
		System.out.println("배열 nums의 2번째 원소 : "+num[1]);
		System.out.println("배열 nums의 3번째 원소 : "+num[2]);
		System.out.println("배열 nums의 4번째 원소 : "+num[3]);
		System.out.println("배열 nums의 5번째 원소 : "+num[4]);
		
		
		for (i=0; i<5; i++)
		{
			
			System.out.println("배열 nums의 "+(i+1)+"번째 원소 : "+num[i]);
		}
		
		
		//배열의 길이
		System.out.println("배열 nums의 원소의 개수 : "+num.length);
	}

}
