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
		System.out.println("�й� : "+studentId);
		System.out.println("�̸� : "+stduentName);
		System.out.println("���� : "+major);
		System.out.println("�г� : "+grade);
		
		
	}
	
	

}
