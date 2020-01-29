package pond.goose;

import pond.shore.Bird;

public class Gosling extends Bird {

	public void swim() {
		floatInWater();	//calling protected member from superclass
		System.out.println(text);//calling protected member form superclass
	}
}
