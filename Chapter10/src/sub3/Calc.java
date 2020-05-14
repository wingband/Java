package sub3;

public class Calc {

	//�̱��水ü
	//static �ϴ� ����
	//Method�� �־�ߵǴϱ�
	private static Calc instance = new Calc();
	
	//Getter�� �����ߵ�
		public static Calc getInstance() {
			return instance;
		}
		
		//�ܺο��� Calc �������ϰ� ���ƾߵ�	
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
		
		
		// �ش� �޼���� ������ �߻��Ҽ� �ִٴ� ���ɼ��� throws ������ ���� ȣ���ϴ� ������ �˸�
		public int div(int x, int y) throws Exception {
			
			if(y < 0) {
			//������ �߻��Ҷ� �޼��带 ȣ���ϴ� ������ ������ ������
				Exception e = new Exception("y�� ����̾�� �մϴ�.");
				throw e;
			}else if (y==1) {
				Exception e = new Exception("y�� 1�� �Ǹ� �ȵȴ�.");
				throw e;
			}
			
			return x / y;
		} 

}
