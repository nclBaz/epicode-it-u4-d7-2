package u4d7.entities;

public class Student {
	private String name;
	private String surname;
	private int age;

	public Student(String name, String surname, int age) {
		super();
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {

		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.name == s.name && this.surname == s.surname && this.age == s.age) {
			return true;
		} else {
			return false;
		}
	}

}
