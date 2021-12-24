package designpatterns.builderpattern;

public class PersonBuilder {
	private String name;
	private int id;
	private String email;
	
	//so many attributes
	
	public PersonBuilder name(String name) {
		this.name = name;
		return this;
	}
	public PersonBuilder id(int id) {
		this.id = id;
		return this;
	}
	public PersonBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Person builder() 
	{
		return new Person(this);
	}
	
	
}
