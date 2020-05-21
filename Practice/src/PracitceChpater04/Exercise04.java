package PracitceChpater04;

public class Exercise04 {
	public static void main(String[] args) {

		
		while(true) {
			
		
		int a = (int) (Math.random()*6)+1;
		int b = (int) (Math.random()*6)+1;
		System.out.println("("+a+", "+b+")");
//		System.out.println((Math.random()*6)+1);
		
			if(a+b==5) {
				
				break;
			}
		}
	}
}