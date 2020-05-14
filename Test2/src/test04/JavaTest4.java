package test04;

public class JavaTest4 {
	public static void main(String[] args) {
		Student.studentId = 20201010;
		
		Student kim = new Student("김유진", "국문과",1);
		kim.studentInfo();
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentInfo();
		
		Student lim = new Student("임꺽정","경영학과",1);
		lim.studentInfo();
				
	}

}
