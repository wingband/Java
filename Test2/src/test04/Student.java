package test04;

public class Student {
	
	public static int studentId;
	private String stduentName;
	private String major;
	private int grade;
	
	public Student(String stduentName, String major, int grade) {
		
		studentId++;
		this.stduentName = stduentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("=========");
		System.out.println("학번 : "+studentId);
		System.out.println("이름 : "+stduentName);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grade);
		
		
	}
	
	

}
