package test08;

public class Television extends Product {

	public Television(String categroy, int price) {
		super(categroy, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void info() {
		System.out.println("��ǰ�з� : "+categroy);
		System.out.println("��ǰ���� : "+price);
	}

}
