package sub2;

public class Account {
	// Ư�� (�������)
	// ���ٱ��� private �������� ĸ��ȭ
	private String bank;
	private String id;
	private String name;
	private int money;

	// ������ -> ����
	Account(String bank, String id,String name,int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
		
	}
	
		// ��� (�޼���)
		public void deposit(int added_money) {
			this.money += added_money;
			
		}
		
		public void withdraw(int money) {
			this.money -= money;
		}
		
		public void info() {
			System.out.println("===============");
			System.out.println("����� : "+this.bank);
			System.out.println("���¹�ȣ : "+this.id);
			System.out.println("�� �� ��  : "+this.name);
			System.out.println("�����ܾ� : "+this.money);
		}
		
	}


