package sub3;


/*
 * 
 *  Add Test 
 * ��ü�޸� ���� �ǽ��ϱ�
 */


public class AddTest {
	public static void main(String[] args) {
		
		//���� ����
		int arr[] = {10,20,30};
		
		
		Adder a = new Adder(100);
		
		a.add(100);
		System.out.println("��ü a�� ��� x :"+a.getX());
		
		a.add(a);
		System.out.println("��ü a�� ��� x : "+a.getX());
		
		// ���⼭ �Լ��� ����� �����⶧����
		
		a.add(arr);
		System.out.println("�迭 arr�� 1��° ���� : "+arr[0]);
		
		a.addNew(a);
		System.out.println("��ü a�� ��� x : "+a.getX());
	}
	
	
	

}
