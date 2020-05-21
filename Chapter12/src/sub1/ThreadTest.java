package sub1;

//Thread 실습하기

// 하나의 프로세스에서 실행되는 실행 흐름
public class ThreadTest {
	public static void main(String[] args) {
		
		SubThread sub1 = new SubThread("Sub1");
		SubThread sub2 = new SubThread("Sub2");
	
//		sub1.run();
//		sub2.run();
//		비동기(Asyncronize) 방식으로 실행
		sub1.start();
		sub2.start();
		
		
		
		for(int i=1; i<=10; i++) {
			System.out.println("Main Thread 실행...");
		}
		
		System.out.println("Main Thread 종료...");
		
	}
	

}
