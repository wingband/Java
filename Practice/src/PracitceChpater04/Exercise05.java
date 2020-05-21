package PracitceChpater04;

public class Exercise05 {
	public static void main(String[] args) {
		
		int a = 60;
		for(int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				
				if (a == 4*x+5*y) {
					System.out.println("("+x+", "+y+")");	
				}
				
			}
		}
		
		
	}

}
