package sub2;


//제네릭 클래스 실습하기
public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		Product<TV, Integer> p1 = new Product<>(tv, 3000);
		Product<SmartPhone, String> p2 = new Product<>(phone, "갤럭시");
		
		p1.show();
		p2.show();
		
		
	}

}
