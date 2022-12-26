package test2;

class Person {
private String name;
	
	Person(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Person) {
		Person person = (Person) obj;
		if (person.name == this.name) {
			return true;			
		}
		return false;
	}
		return false;
}
public class EqualsTest {
	
	public static void main(String[] args) {
	
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동");
		
		
		System.out.println(p1.hashCode());		//1865127310
		System.out.println(p2.hashCode());

		System.out.println(p1 == p2);			//스택메모리가 달라서 false
		System.out.println(p1.equals(p2));		//
	
	}

    }
}
