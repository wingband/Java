package sub1;


/*
 * 
 * 
 * 클래스 상속 실습하기
 */

public class InheritTest {
	
	public static void main(String[] args) {
		
		
		Account nh = new Account("농협", "123123", "임진욱", 123123);
		nh.deposit(1000);
		nh.withdraw(5000);
		nh.info();
		
		
		StockAccount kb = new StockAccount ("국민은행", "131231313", "홍길동", 190, "삼성전자", 100,3000);
		kb.deposit(50000);
		kb.withdraw(7000);
		kb.buy(123123);
		kb.sell(123);
		kb.info();
				
	}
	

}
