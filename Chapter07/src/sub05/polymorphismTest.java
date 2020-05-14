package sub05;

import java.util.Scanner;

public class polymorphismTest {
	public static void main(String[] args) {
		
		OverWatch ow;
		System.out.println("플레이할 캐릭터 번호 선택(1.메이, 2.리퍼, 3.맥크리)");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			ow = new Mei();
		}else if (n==2) {
			ow = new Reaper();
		}else {
			ow = new Mccree();
		}
		
		ow.name();
		ow.lClick();
		ow.rClick();
		ow.shiftButton();
		ow.eButton();
		ow.qButton();
		
	}

}
