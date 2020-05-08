package PracticeChapter03;

public class Excercise02 {
	public static void main(String[] args) {
		
		int x =10;
		int y =20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		int score = 85;
		String result = (!(score>90))? "°¡":"³ª";
		System.out.println(result);
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils%students);
		System.out.println(pencilsLeft);
		
		int value = 515155151;
		int length = (int)Math.log10(value);
		int result2 = (int)Math.pow(10, length);
//		System.out.println(result2);
		System.out.println((value/result2)*result2);
		
	}

}
