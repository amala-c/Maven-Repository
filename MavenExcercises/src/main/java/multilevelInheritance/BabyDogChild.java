package multilevelInheritance;

public class BabyDogChild extends DogSuper{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BabyDogChild obj = new BabyDogChild();
		obj.breed();
		obj.eat();
		obj.baby();
		
	}
	
	public void baby()
	{
		System.out.println("Baby dog");
	}

}
