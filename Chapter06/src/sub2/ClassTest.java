package sub2;
/*
 * 
 *  �ڹ� Ŭ���� �ǽ��ϱ�
 * 
 */
public class ClassTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		
		//�������� ��ü���� �� �ʱ�ȭ
		Account kb = new Account("��������", "01076714980", "������", 1000);
		
		//��ü �ʱ�ȭ
//		kb.bank = "��������";
//		kb.id = "01076714980";
//		kb.name = "������";
//		kb.money = 1000;
		
		// �Ա�, ����ϱ�
		kb.deposit(1000);
		kb.withdraw(500);
//		kb.money--;
		kb.info();
		
		System.out.println("===============");
		//�������� ��ü ������ �ʱ�ȭ
		Account sh = new Account("��������", "01076714980","������",15000);
		//��ü�ʱ�ȭ
//		sh.bank = "��������";
//		sh.id = "01076714980";
//		sh.name = "������";
//		sh.money = 15000;
//		
		//��,����ϱ�
		sh.deposit(2000);
		sh.withdraw(400);
		sh.info();
		
	}

}
