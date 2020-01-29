package pond.shore;
//same package as Bird , no need to import anything
public class BirdWatcher {
	
	public void watchBird() {
		
		Bird bird = new Bird();
		bird.floatInWater(); //need to use bird.  because its using Bird constructor
		System.out.println(bird.text);
	}
	
}
