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
		
		//////
		Adder abc = new Adder(100);
		
		////////
		
		abc.add(100);
		System.out.println("��ü a�� ��� x :"+abc.getX());
		
		abc.add(abc);
		System.out.println("��ü a�� ��� x : "+abc.getX());
		
		// ���⼭ �Լ��� ����� �����⶧����
		
		abc.add(arr);
		System.out.println("�迭 arr�� 1��° ���� : "+arr[0]);
		
		abc.addNew(abc);
		System.out.println("��ü a�� ��� x : "+abc.getX());
	}
	
	
	

}
