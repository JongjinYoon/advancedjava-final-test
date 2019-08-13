package prob04;

public class Person {
	private static int numberOfPerson = 0; // 전체 인구수
	private int age;
	private String name;
	
	public Person() {
		setAge(12);
		setName("");
	}
	public Person( String name ){
		setAge(12);
		setName(name);
	}
	
	public Person(int age, String name){
		setAge(age);
		setName(name);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void selfIntroduce(){
		// "내 이름은 ...이며, 나이는 ...살입니다." 출력함
		// 예) 내이름은 김철수이며, 나이는 19살 입니다.
		System.out.println("내 이름은 " + getName() + "이며, 나이는" + getAge() + "입니다.");
	}

	static int getPopulation(){
		setNumberOfPerson(++numberOfPerson);
		return getNumberOfPerson();
	}

	public static int getNumberOfPerson() {
		return numberOfPerson;
	}

	public static void setNumberOfPerson(int numberOfPerson) {
		Person.numberOfPerson = numberOfPerson;
	}
}

