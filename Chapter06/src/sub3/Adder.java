package sub3;

public class Adder {
	
	//��� ����
	//public int x; �� �´µ� ���ص� ��, �տ� ������ ���ϸ� public�̴� �����ϸ��
	private int x;

	//������ -> �����̴� �ܿ�!
	Adder(int x){
		this.x =x;
	}
	///////////////////////////////////////////////
	
	
	/////////////////////////////////////////////////
	//getter, setter
	// �ܺο��� ��������� ���� ���������� �ʿ��� ��� ����ϴ� �޼ҵ� 
	
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
	
	public void add(Adder a) {
		a.x +=40;
	}
	
	//�迭, ��������
	public void add(int[] arr) {
		arr[0]++;
	}
	
	public void addNew(Adder a2) {
		a2 = new Adder(1);
	}
	
}
