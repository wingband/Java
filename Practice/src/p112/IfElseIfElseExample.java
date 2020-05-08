package p112;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		
	
	int score = 85;
	
	if(score>=90) {
		System.out.println("점수가 100-90입니다.");
		System.out.println("등급이 A입니다.");
		
	} else if(score>=80){
		System.out.println("점수가 80-89입니다..");
		System.out.println("등급이 B입니다.");
	}
	else if(score>=70){
		System.out.println("점수가 70-79 입니다.");
		System.out.println("등급이 C입니다.");
	}
	else {
		System.out.println("점수가 70미만 입니다.");
		System.out.println("등급이 B입니다.");
	}
}
}
