package sub4;

public class Increment {
	
	private int num1;
	//정적 변수 (클래스 변수)
	private static int num2;
	
	//생성자(해당 클래스 표준)
	//필수 생성자
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// 정적메서드 (클래스 메소드)
	public static void add() {
//		num1++;
		num2++;

//		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	// 변형된 생성자를 또 정의할수 있다.
	// 사용자 정의 생성자
	
	public Increment()
	{
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	

}
