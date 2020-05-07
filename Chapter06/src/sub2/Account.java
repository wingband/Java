package sub2;

public class Account {
	// 특성 (멤버변수)
	// 접근권한 private 선언으로 캡슐화
	private String bank;
	private String id;
	private String name;
	private int money;

	// 생성자 -> 공식
	Account(String bank, String id,String name,int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
		
	}
	
		// 기능 (메서드)
		public void deposit(int added_money) {
			this.money += added_money;
			
		}
		
		public void withdraw(int money) {
			this.money -= money;
		}
		
		public void info() {
			System.out.println("===============");
			System.out.println("은행명 : "+this.bank);
			System.out.println("계좌번호 : "+this.id);
			System.out.println("입 금 주  : "+this.name);
			System.out.println("현재잔액 : "+this.money);
		}
		
	}


