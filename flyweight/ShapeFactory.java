package designpatterns.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	// storage of the objects
	private static final HashMap<String , Circle> circleMap = new HashMap();
	
	public static Shape getCircle(String color) 
	{
		// Aggregation
		Circle circle = circleMap.get(color); // get object from the hashmap
		if (circle == null) // the object not created.
		{
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating Circle ..... With the color "+ color);
		}
		return circle;
	}
}
