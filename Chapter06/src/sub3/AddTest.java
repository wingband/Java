package sub3;


/*
 * 
 *  Add Test 
 * 객체메모리 생성 실습하기
 */


public class AddTest {
	public static void main(String[] args) {
		
		//먼저 선언
		int arr[] = {10,20,30};
		
		//////
		Adder abc = new Adder(100);
		
		////////
		
		abc.add(100);
		System.out.println("객체 a의 멤버 x :"+abc.getX());
		
		abc.add(abc);
		System.out.println("객체 a의 멤버 x : "+abc.getX());
		
		// 여기서 함수가 사라짐 끝났기때문에
		
		abc.add(arr);
		System.out.println("배열 arr의 1번째 원소 : "+arr[0]);
		
		abc.addNew(abc);
		System.out.println("객체 a의 멤버 x : "+abc.getX());
	}
	
	
	

}
