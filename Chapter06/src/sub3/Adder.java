package sub3;

public class Adder {
	
	//멤버 변수
	//public int x; 가 맞는데 안해도 됨, 앞에 선언을 안하면 public이다 생각하면됨
	private int x;

	/////////////////////////////////////////////////
	//생성자 -> 공식이다 외워!
	Adder(int x){
		this.x =x;
	}
	
	/////////////////////////////////////////////////
	//getter, setter
	// 외부에서 멤버변수에 대한 직접참조가 필요할 경우 사용하는 메소드 
	
	public int getX() {
		return x;
	}
		
	public void setX(int x) {
		this.x = x;
	}
	
	////////////////////////////////////////
	
	
	
	
	
	public void add(int x) {
		this.x = x+50;
		}
	
	public void add(Adder a1) {
		a1.x +=40;
	}
	
	//배열, 참조변수
	public void add(int[] arr) {
		arr[0]++;
	}
	
	

	
		
	public void addNew(Adder a2) {
		a2 = new Adder(1);
	}
	
}
