package sub05;

public class Mccree implements OverWatch{

	@Override
	public void name() {
		System.out.println("�̸� : ��ũ��");
		
	}

	@Override
	public void lClick() {
		System.out.println("��Ŭ�� : �ǽ�Ű��");
		
	}

	@Override
	public void rClick() {
		System.out.println("��Ŭ�� : ��� �Ѿ� �߻�");
		
	}

	@Override
	public void shiftButton() {
		System.out.println("shift : ������");
		
	}

	@Override
	public void eButton() {
		System.out.println("e : ����ź");
		
	}

	@Override
	public void qButton() {
		System.out.println("q : Ȳ���� ������(�ñر�)");
		
	}
	

}
