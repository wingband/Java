package sub1;

public class MultiArrayTest {
	public static void main(String[] args) {
		
		// 1���� �迭 
		int[] scores = {80, 60, 78, 62, 92};
		int sum = 0;
		
		for (int i = 0; i<5; i++) {
			sum += scores[i]; 
			
		}
			System.out.println(sum);
			System.out.println("=== �ٸ� ǥ����� ===");
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		System.out.println("=============");
		
		
		// 2���� �迭
		int arr2d[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println("�迭 arr2d��  1�� 1���� ���Ҵ� :"+arr2d[0][0]);
		System.out.println("�迭 arr2d��  1�� 2���� ���Ҵ� :"+arr2d[0][1]);
		System.out.println("�迭 arr2d��  1�� 3���� ���Ҵ� :"+arr2d[0][2]);
		System.out.println("�迭 arr2d��  1�� 4���� ���Ҵ� :"+arr2d[0][3]);
		
		System.out.println("�迭 arr2d��  2�� 1���� ���Ҵ� :"+arr2d[1][0]);
		System.out.println("�迭 arr2d��  2�� 2���� ���Ҵ� :"+arr2d[1][1]);
		System.out.println("�迭 arr2d��  2�� 3���� ���Ҵ� :"+arr2d[1][2]);
		System.out.println("�迭 arr2d��  2�� 4���� ���Ҵ� :"+arr2d[1][3]);
		
		System.out.println("�迭 arr2d��  3�� 1���� ���Ҵ� :"+arr2d[2][0]);  
		System.out.println("�迭 arr2d��  3�� 2���� ���Ҵ� :"+arr2d[2][1]);  
		System.out.println("�迭 arr2d��  3�� 3���� ���Ҵ� :"+arr2d[2][2]);  
		System.out.println("�迭 arr2d��  3�� 4���� ���Ҵ� :"+arr2d[2][3]);  
		
		System.out.println("=== �ٸ� ǥ����� ===");
		System.out.println(arr2d[2].length);
		int m, n;
		for(m=0; m<arr2d.length; m++) {
			for (n=0; n<arr2d[m].length; n++) {
			
			System.out.println("�迭 arr2d�� "+(m+1)+"�� "+(n+1)+"���� ���Ҵ� "+arr2d[m][n]);
			
		}
		}
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");	
		// 3���� �迭
		
		int arr3d[][][] = {{{1,2,3,4},{5,6,7,8},{9,10,11,12}}, {{1,2,3,4},{5,6,7,8},{9,10,11,12}}, {{1,2,3,4},{5,6,7,8},{9,10,11,12}}};
		
		int o,p,q;
		for(o = 0; o<arr3d.length; o++) {
			for(p = 0; p<arr3d[o].length; p++) {
				for(q = 0; q<arr3d[o][p].length; q++){
					System.out.println("�迭 arr3d��"+(o+1)+"��° "+(p+1)+"�� "+(q+1)+"���� ���Ҵ� "+arr3d[o][p][q]+"�Դϴ�.");
//					System.out.println(arr3d[o].length);
				}
//				System.out.println(arr3d[p].length);}
			
		}
//		System.out.println(arr3d.length);
	}

}
}

