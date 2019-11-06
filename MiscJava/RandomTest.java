import java.lang.*;

public class RandomTest{

public static void main(String[] args) {

String [] animals = {"Cat", "Dog", "Girrafe", "Wombat", "Ninja Turtle"};



for(int i = 0; i < 10; i++) {

	int index = (int)(Math.random() * 5);

	System.out.println(animals[index]);

}


}

}
