package 학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {
		
		// Student 자료형 stu1 객체 생성
		Student stu1 = new Student();
		
		stu1.setName("임경남");
		stu1.setNumber("20220458");
		stu1.setAge(20);
		stu1.setScoreJava(50);
		stu1.setScoreWeb(99);
		stu1.setScoreAndroid(77);
		
		// 이름, 자바 점수 출력
		
		System.out.println(stu1.getName());
		System.out.println(stu1.getScoreJava());
		
		
		
		
	}

}
