package loops;

//abstract class
abstract class Pet {
	abstract void makeSound();
}


  class Cat extends Pet{
	  public void makeSound() {
		  System.out.println("The sound that a Cat makes: Meow Meow");
	  }
  }
  
  
   class Dog extends Pet {
	   public void makeSound() {
		   System.out.println("The sound that a Dog makes: Woof Woof");
	   }
   }

public class HomePet {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.makeSound();
		
		Dog d = new Dog();
		d. makeSound();

	}

}
