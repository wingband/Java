package sub2;


//���׸� Ŭ���� �ǽ��ϱ�
public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		Product<TV, Integer> p1 = new Product<>(tv, 3000);
		Product<SmartPhone, String> p2 = new Product<>(phone, "������");
		
		p1.show();
		p2.show();
		
		
	}

}
