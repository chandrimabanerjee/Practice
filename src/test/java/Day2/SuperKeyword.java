package Day2;
class Animal{
	
	String colour="Black";
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void display() {
		System.out.println(super.colour);	
	}
	void eat() {
		super.eat();
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Dog d= new Dog();
 d.display();
 d.eat();
 
	}

}
