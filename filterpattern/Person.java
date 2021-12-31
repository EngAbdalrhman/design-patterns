package designpatterns.filterpattern;

public class Person {
	private String gender;
	private String name;
	private String status;
	
	public Person(String name ,String gender, String status) {
		this.gender = gender;
		this.name = name;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + ", status=" + status + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
