package test05;

public class JavaTest5 {
public static void main(String[] args) {
	
	
	CarFactory factory = CarFactory.getInstance();
	
	Car avante = factory.createCar("�ƹ���", 2500);
	Car sonata = factory.createCar("�ҳ�Ÿ", 3000);
			
	avante.info();
	sonata.info();
			
	}
}