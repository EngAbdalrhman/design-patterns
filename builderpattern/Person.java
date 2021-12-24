package designpatterns.builderpattern;

public class Person {
	public final String name;
	public final int id;
	public final String email;
	
	public Person(PersonBuilder builder) 
	{
		this.id = builder.getId();
		this.name = builder.getName();
		this.email = builder.getEmail();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
}
