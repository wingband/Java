package sub4;

public class Increment {
	
	private int num1;
	//���� ���� (Ŭ���� ����)
	private static int num2;
	
	//������(�ش� Ŭ���� ǥ��)
	//�ʼ� ������
	public Increment(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// �����޼��� (Ŭ���� �޼ҵ�)
	public static void add() {
//		num1++;
		num2++;

//		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	// ������ �����ڸ� �� �����Ҽ� �ִ�.
	// ����� ���� ������
	
	public Increment()
	{
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	

}
