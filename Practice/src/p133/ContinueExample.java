package p133;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue; // 나눠서 0이 아닌경우, 즉 홀수 일경우 위로 다시 올라감
							// break 일경우는 밖으로 빠져나옴				
			}
			System.out.println(i);
		}
		
	}

}
