package sub1;

//Thread �ǽ��ϱ�

// �ϳ��� ���μ������� ����Ǵ� ���� �帧
public class ThreadTest {
	public static void main(String[] args) {
		
		SubThread sub1 = new SubThread("Sub1");
		SubThread sub2 = new SubThread("Sub2");
	
//		sub1.run();
//		sub2.run();
//		�񵿱�(Asyncronize) ������� ����
		sub1.start();
		sub2.start();
		
		
		
		for(int i=1; i<=10; i++) {
			System.out.println("Main Thread ����...");
		}
		
		System.out.println("Main Thread ����...");
		
	}
	

}
