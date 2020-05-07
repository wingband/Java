package sub2;
/*
 * 
 *  자바 클래스 실습하기
 * 
 */
public class ClassTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		
		//국민은행 객체생성 및 초기화
		Account kb = new Account("국민은행", "01076714980", "임진욱", 1000);
		
		//객체 초기화
//		kb.bank = "국민은행";
//		kb.id = "01076714980";
//		kb.name = "임진욱";
//		kb.money = 1000;
		
		// 입금, 출금하기
		kb.deposit(1000);
		kb.withdraw(500);
//		kb.money--;
		kb.info();
		
		System.out.println("===============");
		//신한은행 객체 생성및 초기화
		Account sh = new Account("신한은행", "01076714980","임진욱",15000);
		//객체초기화
//		sh.bank = "신한은행";
//		sh.id = "01076714980";
//		sh.name = "임진욱";
//		sh.money = 15000;
//		
		//입,출금하기
		sh.deposit(2000);
		sh.withdraw(400);
		sh.info();
		
	}

}
