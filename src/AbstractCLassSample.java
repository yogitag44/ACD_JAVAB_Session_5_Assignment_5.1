import java.util.Scanner;  //Java Scanner class to take input from user

abstract class AbstractCLassSample {  //Abstract class which must have one abstract method
	
	 abstract public void Smile();  //Declared Abstract Method
	 
	 public static void main(String args[]) {  //main class
			AbstractCLassSample obj = new ChildClass();  //created object of parent class with constructor of child class
			obj.Smile();  //calling abstract method Smile() declared in Parent but defined in child class
			obj.SimpleMethodParent();
		}
	 
	 public void SimpleMethodParent() {  //we can call this method using object of parent class in main method.
		 System.out.println("\n\n======NON Abstract method inside abstract class======");
		 System.out.println("\nThis is Parent method with method name SimpleMEthodParent()");
	 }
}

class ChildClass extends AbstractCLassSample{   //Child class extends property of Parent class
	
	public void Smile() {   //defining abstract method body here
		System.out.println("======Abstract method inside abstract class======");
		System.out.println("\nThis is abstract class which says \"I am happy\"");  //Printing value 
	}
	
	
	public void SimpleMehodChild() {   //Can not call this method as this is not defined in abstract class and hence can not inherit its property
		 System.out.println("This is not abstract method and defined in child class with name SIMPLEMETHOD()");
	 }
	
}
