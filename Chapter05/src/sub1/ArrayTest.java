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
//		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
		
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
		
		System.out.println("=============");
		//�迭�� ����
		System.out.println("�迭 nums�� ������ ���� : "+num.length);
		System.out.println("=============");
		//Ȯ�ι���
//		int k= 1;
		String p1 = "������";		
		String p2 = "���ᱸ";		
		String p3 = "�庸��";		
		String p4 = "������";		
		String p5 = "�̼���";
		
//		for (k=1, k<6, k++)
//		{
//			String[] people
//		}
		String[] people = {p1, p2, p3, p4, p5};
		//�迭�� �ݺ���
		
		int l;
		for (l=0; l<people.length; l++) {
			if(l < people.length-1) {
				System.out.print(people[l]+", ");	
			}
			else 
			{
				System.out.print(people[l]);
			}
		}
		
		//�迭�� �ݺ���
		
		
				
	}

}
