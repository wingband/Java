package sub2;

/*
 *  String ��� �ǽ�
 * 
 * 
 */
public class StringMemberTest {
	public static void main(String[] args) {
		String str = "Hello Korea";
		
		// length = ���ڰ���
		System.out.println("str ���ڿ� ���� : " +str.length());
		
		// charAt - ���ڿ����� Ư������ ����
		System.out.println("str 6��° ���� : " +str.charAt(6));
		
		
		// substring - 
		System.out.println("str 0��°���� 5�������� ���ڿ� : " +str.substring(0, 5));
		System.out.println("str 0��°���� 5�������� ���ڿ� : " +str.substring(6));
		
		
		// indexOf -�տ��� �ε�����
		// lastIndexOf - �ڿ������� �ε�����
		System.out.println("str ���ڿ� ���� : " +str.indexOf("o"));
		System.out.println("str ���ڿ� ���� : " +str.lastIndexOf("o"));
		
		
		// replace
		System.out.println("str ���ڿ� ���� : " +str.replace("H", "e"));

		
		// valueOf
		int var1 = 1;
		double var2 = 2.12;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1); 
		String s2 = String.valueOf(var2); 
		String s3 = ""+var3; 
//		String s3 = var3;
		
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
//		System.out.println("str ���ڿ� ���� : " +str.valueOf(true));

	}

}
