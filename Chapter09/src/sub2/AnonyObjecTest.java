package sub2;


/*
 * 
 * �͸�ü �ǽ��ϱ� 
 * 
 * 
 */
public class AnonyObjecTest {
	public static void main(String[] args) {
		
		//�͸�ü - �������̽��� Ŭ���� �������� �ٷ� new�������� ��ü�� �����ϴ°� 
		Person p = new Person() {
			
			@Override
			public void info() {
				System.out.println("Person info...");
				
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
				
			}
		}; 
		
		p.info();
		p.hello();
	}
	

}
