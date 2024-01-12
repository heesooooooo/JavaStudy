package 학생정보관리프로그램;

public class Student {

	
	// 1. Field
	// 개인정보니까 private
	// 이름
	private String name;
	// 학번
	private String number;
	// 나이
	private int age;
	// 자바 점수
	private int scoreJava;
	// 웹 점수
	private int scoreWeb;
	// 안드로이드 점수
	private int scoreAndroid;
	
	
	// 생성자(constructor)
	// --> 객체를 생성하는 순간에 실행되는 메소드
	// --> 필드에 있는 데이터를 객체를 생성하는 순간에 초기화(초기값)를
	//     시켜줄 수 있도록 로직 작성
	public Student(String name, String number, int age) {
		this.name= name;
		this.number=number;
		this.age=age;
	}

	// 2. Method
	// getter 메소드
	// ---> 클래스 내부에 있는 필드 값을
	//      외부(다른 클래스)에서 가져갈 수 있는 메소드
	public String getName() {
		return name;
	}
	
	//setter 메소드
	// ---> 클래스 내부에 있는 필드 값을
	//      외부 (다른 클래스)에서 수정할 수 있도록 하는 메소드
	public void setName(String name) {
		this.name = name;
	}

	
	// getters, setters, 생성자 자동완성 단축키
	// alt shift s ---> Generate Getters and Setters 옵션
	// alt shift s ---> Generate Constructor using Fields
	// 단축키 안될경우!
	// 마우스 우클릭 -> Source -> Generate Getters and Setters 옵션
	
	 
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

	
	
	
	
	
	
}
