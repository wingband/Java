package sub2;


/*
 * 
 * �پ��� ����ó�� �ǽ��ϱ�
 */
public class KindOfExceptionTest {
	public static void main(String[] args) {
		//�迭�� ũ�⿡�� ��� �ε���

		//�迭 ������ �Ҵ�
		int arr[] = new int[3];
		
		for(int i=0; i<=3; i++ ) {
			
			try {
				arr[i] = (i+3);
			}catch (ArrayIndexOutOfBoundsException e) {
				//Exception���� �ص� �������
				// ArrayIndexOutOfBoundsException �̰� array�� �ִ� �͸� �� ��� ����ó����
				System.out.println("�迭�� �ε������� �����ϴ�.");
			}
			
//			System.err.println(arr[i]);
			}
		
		// �̰� ��û ������ for���̳�... 
//		for(int num :arr) {
//			System.out.print(num+", ");
//		}
		
		
		//NullPoint ����
//		Null������ Point�Ϸ��� �ϴµ� �̰� ��Ŭ������ ���׷��̵� �Ǹ鼭 ����� �ȵ�
//		�׷��� try ~ catch�� �Ἥ �Ѱܹ���
		
		try {
		Tiger tiger =  null;
		tiger.hunt();
		tiger.move();
		//
		}catch (NullPointerException e) {
			System.out.println("Tiger ��ü�� �������� �ʾҽ��ϴ�.");
		}
		
		//ĳ���� ����
		
		try {
		Animal a1 = new Eagle(); //��ĳ����(������)
		Animal a2 = new Shark(); //��ĳ����(������)
		
		Shark shark = (Shark) a1;
		shark.move();
		} catch (Exception e) {
			System.out.println("ĳ���� ������ �߸��Ǿ����ϴ�.");
		}
		
		
		
		
		
		
		
		System.out.println("���α׷� ����..");
		
		
	}

}
