package PracticeChapter03;

public class Excercise06 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop+lengthBottom)*height*1/2);
		System.out.println(area);
		
		
		int x = 10;
		int y = 5;
		
		System.out.println((x>7)&&(y<=5));
		System.out.println((x%3)==2 || (y%2!=1));
		
		double x1 = 1.0;
		double y1 = 0.0;
		
		double z1 = x%y;
		
		System.out.println(z1);
//		double result = z1+10;
//		System.out.println("결과 : " +result);
		if ((x1%y1) != 0) {
			System.out.println("0.0으로 나눌수 없습니다.");
		}else {
			double result = z1+10;
			System.out.println("결과 : " +result);
		}
		
		
	}

}
