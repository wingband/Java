package test08;

public class Computer extends Product{

	public Computer(String categroy, int price) {
		super(categroy, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void info() {
		System.out.println("力前盒幅 : "+categroy);
		System.out.println("力前啊拜 : "+price);
	}
	
	

}
