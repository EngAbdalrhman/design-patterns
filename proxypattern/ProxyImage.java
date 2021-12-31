package designpatterns.proxypattern;

public class ProxyImage implements Image{
	private RealImage img; // composition (uses)
	private String fileName;
	
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() 
	{
		// if there isn't an object created then create one , at all cases display after check
		if(img==null)
			img = new RealImage(fileName);
		img.display();
	}
	
}
