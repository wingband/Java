package sub05;

public class Reaper implements OverWatch{

	@Override
	public void name() {
		System.out.println("�̸� : ����");
		
	}

	@Override
	public void lClick() {
		System.out.println("��Ŭ�� : �����̾� ����");
		
	}

	@Override
	public void rClick() {
		System.out.println("��Ŭ�� : ����");
		
	}

	@Override
	public void shiftButton() {
		System.out.println("shift : ����ȭ");
		
	}

	@Override
	public void eButton() {
		System.out.println("e : �׸��� ���");
		
	}

	@Override
	public void qButton() {
		System.out.println("q : ������ �� (�ñر�)");
		
	}

}
