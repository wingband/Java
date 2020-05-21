package sub2;

/*
 * 
 * 쓰레드 활용 실습하기
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
		
//		메인쓰레드에서 파생된 서브쓰레드의 작업이 완료된 후 다시 메인쓰레드로 합류하는것을 실행
		ct1.join();
		ct2.join();
		ct3.join();
//	 	병행실행을 하다보니 누락된 값이 나타나고 그걸 보완하기 위해선 동기화가 필요하다 즉 줄을 세워야된다 
//		순서는 상관없지만 하나씩 들어와야된다
		
		
		
		
		System.out.println("결과 : "+count.getNum());
		
		
	}

}
