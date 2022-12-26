package test2;

abstract class A {
	abstract void abc();
}

class B extends A {
	void abc() {
		
	}
}
public class AbstractMethodTest {

	public static void main(String[] args) {
		A a = new B();
		class C extends A {
			void abc() {
				
			}
		}
		A a2 = new A() {
			void abc() {}
		};

	}

}
