package sub2;


/*
 * 
 * 다양한 예외처리 실습하기
 */
public class KindOfExceptionTest {
	public static void main(String[] args) {
		//배열의 크기에서 벗어난 인덱스

		//배열 공간만 할당
		int arr[] = new int[3];
		
		for(int i=0; i<=3; i++ ) {
			
			try {
				arr[i] = (i+3);
			}catch (ArrayIndexOutOfBoundsException e) {
				//Exception으로 해도 상관없다
				// ArrayIndexOutOfBoundsException 이건 array에 있는 것만 콕 집어서 예외처리함
				System.out.println("배열의 인덱스값이 없습니다.");
			}
			
//			System.err.println(arr[i]);
			}
		
		// 이거 엄청 유용한 for문이네... 
//		for(int num :arr) {
//			System.out.print(num+", ");
//		}
		
		
		//NullPoint 에러
//		Null값으로 Point하려고 하는데 이건 이클립스가 업그레이드 되면서 출력이 안됨
//		그래서 try ~ catch를 써서 넘겨버림
		
		try {
		Tiger tiger =  null;
		tiger.hunt();
		tiger.move();
		//
		}catch (NullPointerException e) {
			System.out.println("Tiger 객체가 생성되지 않았습니다.");
		}
		
		//캐스팅 에러
		
		try {
		Animal a1 = new Eagle(); //업캐스팅(다형성)
		Animal a2 = new Shark(); //업캐스팅(다형성)
		
		Shark shark = (Shark) a1;
		shark.move();
		} catch (Exception e) {
			System.out.println("캐스팅 연산이 잘못되었습니다.");
		}
		
		
		
		
		
		
		
		System.out.println("프로그램 종료..");
		
		
	}

}
