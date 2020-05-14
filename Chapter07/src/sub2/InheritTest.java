package sub2;

public class InheritTest {
	public static void main(String[] args) {
		
		
		SalaryStudent kim = new SalaryStudent("임진욱", 12, "헬로", "기계과", "삼성");
		Student lee = new Student("이순신", 11, "거북선", "조립");
		
		kim.hello();
		lee.hello();
				
	}
	

}
