package test02;

import java.util.Scanner;

public class JavaTest2 {
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾을 숫자 입력 : ");
		int find = sc.nextInt();
		
		try {
			searchArray(find, arr);
			System.out.println("해당되는 숫자 찾음!!!");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			sc.close();
		}
		
		System.out.println("프로그램 종료");	
			
			
			
		}

	
	
	public static void searchArray(int find, int[] arr) throws NotFoundException{
		
		for (int i : arr) {
			if( i == find) {
				return;
			}
		
	}
		
		throw new NotFoundException();
		
	}

}
