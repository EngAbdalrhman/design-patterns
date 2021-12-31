package designpatterns.mvcpattern;

public class StudentController {
	// composition
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	//setting and getting model from the controller to perform changes in the view
	public String getId() {
		return model.getId();
	}
	public void setId(String id) {
		model.setId(id);
	}
	public String getName() {
		return model.getName();
	}
	public void setName(String name) {
		model.setName(name);
	}
	
	public void updateView() 
	{
		view.printDetails(getName(), getId());
	}
}
