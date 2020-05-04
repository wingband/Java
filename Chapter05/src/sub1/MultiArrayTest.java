package sub1;

public class MultiArrayTest {
	public static void main(String[] args) {
		
		// 1차원 배열 
		int[] scores = {80, 60, 78, 62, 92};
		int sum = 0;
		
		for (int i = 0; i<5; i++) {
			sum += scores[i]; 
			
		}
			System.out.println(sum);
			System.out.println("=== 다른 표현방법 ===");
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		System.out.println("=============");
		// 2차원 배열
		int arr2d[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println("배열 arr2d의  1행 1열의 원소는 :"+arr2d[0][0]);
		System.out.println("배열 arr2d의  1행 2열의 원소는 :"+arr2d[0][1]);
		System.out.println("배열 arr2d의  1행 3열의 원소는 :"+arr2d[0][2]);
		System.out.println("배열 arr2d의  1행 4열의 원소는 :"+arr2d[0][3]);
		
		System.out.println("배열 arr2d의  2행 1열의 원소는 :"+arr2d[1][0]);
		System.out.println("배열 arr2d의  2행 2열의 원소는 :"+arr2d[1][1]);
		System.out.println("배열 arr2d의  2행 3열의 원소는 :"+arr2d[1][2]);
		System.out.println("배열 arr2d의  2행 4열의 원소는 :"+arr2d[1][3]);
		
		System.out.println("배열 arr2d의  3행 1열의 원소는 :"+arr2d[2][0]);  
		System.out.println("배열 arr2d의  3행 2열의 원소는 :"+arr2d[2][1]);  
		System.out.println("배열 arr2d의  3행 3열의 원소는 :"+arr2d[2][2]);  
		System.out.println("배열 arr2d의  3행 4열의 원소는 :"+arr2d[2][3]);  
		
		System.out.println("=== 다른 표현방법 ===");
		System.out.println(arr2d[2].length);
		int m, n;
		for(m=0; m<arr2d.length; m++) {
			for (n=0; n<arr2d[m].length; n++) {
			
			System.out.println("배열 arr2d의 "+(m+1)+"행 "+(n+1)+"열의 원소는 "+arr2d[m][n]);
			
		}
		}
		
		
		// 3차원 배열
		
		
	}

}
