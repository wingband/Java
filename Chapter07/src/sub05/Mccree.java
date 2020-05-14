package sub05;

public class Mccree implements OverWatch{

	@Override
	public void name() {
		System.out.println("이름 : 맥크리");
		
	}

	@Override
	public void lClick() {
		System.out.println("좌클릭 : 피스키퍼");
		
	}

	@Override
	public void rClick() {
		System.out.println("우클릭 : 모든 총알 발사");
		
	}

	@Override
	public void shiftButton() {
		System.out.println("shift : 구르기");
		
	}

	@Override
	public void eButton() {
		System.out.println("e : 섬광탄");
		
	}

	@Override
	public void qButton() {
		System.out.println("q : 황야의 무법자(궁극기)");
		
	}
	

}
