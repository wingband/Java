package sub05;

import java.util.Scanner;

public class polymorphismTest {
	public static void main(String[] args) {
		
		OverWatch ow;
		System.out.println("�÷����� ĳ���� ��ȣ ����(1.����, 2.����, 3.��ũ��)");
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
