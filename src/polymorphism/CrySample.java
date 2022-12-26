package polymorphism;

class Animal {
	void cry() {
		System.out.println("ㅠㅠ");
	}
	
}

class Bird extends Animal {
	void cry()	{
		System.out.println("짹짹");
	}
}

class Cat extends Animal {
	void cry()	{
		System.out.println("야옹");
	}
}
class Dog extends Animal {
	void cry()	{
		System.out.println("멍멍");
	}
}
class Monkey extends Animal {
	void cry()	{
		System.out.println("우끾끾");
	}
}

public class CrySample {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.cry();
		Dog d = new Dog();
		d.cry();
		
		Animal a2 = new Dog();
		a2.cry();
		
		Animal[] animals = new Animal[] { new Bird(), new Dog(), new Monkey(), new Cat() };
		for (Animal animal : animals) {
			animal.cry();
		}
	}
}
