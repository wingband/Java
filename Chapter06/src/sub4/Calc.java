package sub4;

public class Calc {
	
	//Å¬·¡½ºÀÇ ¸â¹ö°¡ ÁöÀÚ½Å
	//ÀÚ±â ÀÚ½ÅÀÇ ¸â¹ö¸¦ static ¼±¾ğ
	//½Ì±ÛÅæ °´Ã¼
	
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {
	}
	
	public int plus(int x, int y) {
		return x + y;
			
	}
	public int minus(int x, int y) {
		return x - y;
		
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
	
	
	

}
