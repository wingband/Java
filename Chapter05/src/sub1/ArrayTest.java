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
//		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
		
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
		
		System.out.println("=============");
		//배열의 길이
		System.out.println("배열 nums의 원소의 개수 : "+num.length);
		System.out.println("=============");
		//확인문제
//		int k= 1;
		String p1 = "김유신";		
		String p2 = "김춘구";		
		String p3 = "장보고";		
		String p4 = "강감찬";		
		String p5 = "이순신";
		
//		for (k=1, k<6, k++)
//		{
//			String[] people
//		}
		String[] people = {p1, p2, p3, p4, p5};
		//배열의 반복문
		
		int l;
		for (l=0; l<people.length; l++) {
			if(l < people.length-1) {
				System.out.print(people[l]+", ");	
			}
			else 
			{
				System.out.print(people[l]);
			}
		}
		
		//배열의 반복문
		
		
				
	}

}
