package p133;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue; // ������ 0�� �ƴѰ��, �� Ȧ�� �ϰ�� ���� �ٽ� �ö�
							// break �ϰ��� ������ ��������				
			}
			System.out.println(i);
		}
		
	}

}
