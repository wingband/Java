package sub2;


/*
 * 
 * 익명객체 실습하기 
 * 
 * 
 */
public class AnonyObjecTest {
	public static void main(String[] args) {
		
		//익명객체 - 인터페이스를 클래스 구현없이 바로 new연산으로 객체를 생성하는것 
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
