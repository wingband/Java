package sub1;

public class MethodOverloadTest {
	
	public static void main(String[] args) {
		
		int r1 = add(1);
		System.out.println(r1);
		System.out.println(r1);
		
		int r2 = add(1,2);
		System.out.println(r2);
		
		String r3 = add("ȫ�浿");
		System.out.println(r3);
		
		
	} //main end
	
	// �����ε� �޼��� : �Լ����� ������ �Ű������� ������ Ÿ������ �����ϴ� �޼���
	
	public static int add(int a) {
		return a++;
		
	}
	
	public static int add(int a, int b) {
		return a+b;
		
		
	}
	
	public static String add(String a) {
		return a+"�� �ݰ����ϴ�.";
		
		
	}
	
	

}
