package sub2;

/*
 * 
 * ������ Ȱ�� �ǽ��ϱ�
 */
public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException{
		
		Count count = new Count();
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
//		ct1.run();
//		ct2.run();
//		ct3.run();
		
		ct1.start();
		ct2.start();
		ct3.start();
		
//		���ξ����忡�� �Ļ��� ���꾲������ �۾��� �Ϸ�� �� �ٽ� ���ξ������ �շ��ϴ°��� ����
		ct1.join();
		ct2.join();
		ct3.join();
//	 	��������� �ϴٺ��� ������ ���� ��Ÿ���� �װ� �����ϱ� ���ؼ� ����ȭ�� �ʿ��ϴ� �� ���� �����ߵȴ� 
//		������ ��������� �ϳ��� ���;ߵȴ�
		
		
		
		
		System.out.println("��� : "+count.getNum());
		
		
	}

}
