package test06;
import java.util.Scanner;

/*
 * 
 * 
 * �Լ� ��������
 */
public class JavaTest6 {
	
	public static void () {
		System.out.println("*****Start*****");
		System.out.println("�ΰ��� ������ �Է�");
		
	}
	
	public static int input(String name) {
		System.out.println("���� "+name+"�� �Է� : ");
		
		try (Scanner sc = new Scanner(System.in)) {
			int input = sc.nextInt();
			return input;
		}
		
		public static int result(int val) {
			System.out.println("���� ��� : "+val);
			System.out.println("*********End********");
		}
		
		public static int add(int x, int y) {
			return x+y;
		}
		
		public static void main (String[] args) {
			
			intro();
			
			int a =input("a");
			int b = input("b");
			
			int output = add(a, b);
			result(output);
			
		}
		
	}
	
	
		
	}
	


