package sub1;


/*
 * 
 * 
 * Ŭ���� ��� �ǽ��ϱ�
 */

public class InheritTest {
	
	public static void main(String[] args) {
		
		
		Account nh = new Account("����", "123123", "������", 123123);
		nh.deposit(1000);
		nh.withdraw(5000);
		nh.info();
		
		
		StockAccount kb = new StockAccount ("��������", "131231313", "ȫ�浿", 190, "�Ｚ����", 100,3000);
		kb.deposit(50000);
		kb.withdraw(7000);
		kb.buy(123123);
		kb.sell(123);
		kb.info();
				
	}
	

}
