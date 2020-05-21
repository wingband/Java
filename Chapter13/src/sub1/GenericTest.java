package sub1;

/*
 * 
 * 제네릭 실습하기
 * 
 */

public class GenericTest {
	
	public static void main(String[] args) {
		
		Apple 	a = new Apple("한국", 3000);
		Banana 	b = new Banana("중국", 2000);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(a);
		
		FruitBox<Banana> BananaBox = new FruitBox<>();
		BananaBox.setFruit(b);
		
		a.show();
		
		
	}

}
