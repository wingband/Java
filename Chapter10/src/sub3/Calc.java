package sub3;

public class Calc {

	//싱글톤객체
	//static 하는 이유
	//Method에 넣어야되니깐
	private static Calc instance = new Calc();
	
	//Getter를 만들어야됨
		public static Calc getInstance() {
			return instance;
		}
		
		//외부에서 Calc 생성못하게 막아야됨	
		private Calc() {
			}
		
		public int plus(int x, int y) {
			return x + y;
				
			}
		
		public int minus(int x, int y) {
			return x - y;
			}
		
		
		public int multi(int x, int y) {
			return x * y;
			}
		
		
		// 해당 메서드는 에러가 발생할수 있다는 가능성을 throws 선언을 통해 호출하는 쪽으로 알림
		public int div(int x, int y) throws Exception {
			
			if(y < 0) {
			//에러가 발생할때 메서드를 호출하는 쪽으로 에러를 던진다
				Exception e = new Exception("y는 양수이어야 합니다.");
				throw e;
			}else if (y==1) {
				Exception e = new Exception("y는 1이 되면 안된다.");
				throw e;
			}
			
			return x / y;
		} 

}
