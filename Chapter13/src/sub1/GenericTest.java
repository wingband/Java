package sub1;

/*
 * 
 * ���׸� �ǽ��ϱ�
 * 
 */

public class GenericTest {
	
	public static void main(String[] args) {
		
		Apple 	a = new Apple("�ѱ�", 3000);
		Banana 	b = new Banana("�߱�", 2000);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(a);
		
		FruitBox<Banana> BananaBox = new FruitBox<>();
		BananaBox.setFruit(b);
		
		a.show();
		
		
	}

}
