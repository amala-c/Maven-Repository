package inheritanceSamples;

public class SingleInheritDogl extends SingleInheritAnimal {
	void bark(){System.out.println("barking...");}  
	public static void main(String args[]) {
	SingleInheritDogl  obj=new SingleInheritDogl();
    obj.eat();
    obj.bark();
	}
	
}
