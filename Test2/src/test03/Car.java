package test03;

public class Car {
	private String brand;
	private String name;
	private int price;
	
	public Car(String brand, String name, int price)
	{
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public void drive() {
		System.out.println(name+" ���� �� ...");
	}
	
	public void info() {
		System.out.println("�귣�� : "+brand);
		System.out.println("������ : "+name);
		System.out.println("���� : "+price);
	}
	


}
