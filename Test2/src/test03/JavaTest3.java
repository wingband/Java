package test03;

public class JavaTest3 {
	public static void main(String[] args) {
		
		Car sonata = null;
		Car bmw = null;
		
		sonata = new Car("����", "�ҳ�Ÿ", 3000);
		bmw = new Car("BMW", "520d", 5000);
		
		sonata.drive();
		sonata.info();
		bmw.drive();
		bmw.info();
	}

}
