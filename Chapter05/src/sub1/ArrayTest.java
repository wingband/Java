package sub1;


/*
 * 20200504
 * ������
 * �ڹ� �迭 ���� �ǽ�
 * 
 */

public class ArrayTest {
	public static void main(String[] args) {
		
		//����
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
		
		//�迭
		int num[] = {1,2,3,4,5};
		int i;
		System.out.println("�迭 nums�� 1��° ���� : "+num[0]);
		System.out.println("�迭 nums�� 2��° ���� : "+num[1]);
		System.out.println("�迭 nums�� 3��° ���� : "+num[2]);
		System.out.println("�迭 nums�� 4��° ���� : "+num[3]);
		System.out.println("�迭 nums�� 5��° ���� : "+num[4]);
		
		
		for (i=0; i<5; i++)
		{
			
			System.out.println("�迭 nums�� "+(i+1)+"��° ���� : "+num[i]);
		}
		
		
		//�迭�� ����
		System.out.println("�迭 nums�� ������ ���� : "+num.length);
	}

}
