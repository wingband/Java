package sub2;

/*
 * 
 * String Ŭ���� �ǽ��ϱ� ����
 * 
 * 
 * String Ŭ����
 * - ���ڿ��� �����ϴ� ����Ÿ Ÿ��
 * - ���ڿ� ������ �迭�� ���� ������ ���´�
 * - ���ڿ� �񱳴� equals �ż��带 ȣ���Ѵ�.
 */
public class StringTest {
	public static void main(String[] args) {
		
		//���ڿ� = ���� + �迭
		String str = "Hello";
		char[] arr = {'H','e','l','l','o'};
		
		System.out.println(str);
		System.out.println(arr);
		
		
		//���ڿ� ��ü����
		String str1 = new String("Hello!");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello"; // literal ����
		
		if(str1 == str2) {
			System.out.println("str1 �� str2�� �ּҰ��� ����");
		}else {
			System.out.println("str1 �� str2�� �ּҰ��� �ٸ���");
		}
		if(str3 == str4) {
			System.out.println("str1 �� str2�� �ּҰ��� ����");
		}else {
			System.out.println("str1 �� str2�� �ּҰ��� �ٸ���");
		}
		
		//���ڿ� ��
		if(str2.contentEquals(str4)) {
			System.out.println("str1 �� str3�� ���ڿ��� ����");
		}else {
			System.out.println("str1 �� str3�� ���ڿ��� �ٸ���");
		}
		
		
		
	}

}
