package mypack;

public class MainClass {

	public static void main(String[] args) {
	
		// Myclass의 인스턴스를 생성한 후 필드와 메서드에 접근
		MyClass mc = new MyClass();
		//mc.privateInt = 10; 
		//- The field MyClass.privateInt is not visible
		//private 접근 지정자로 선언된 멤버 필드는 접근할 수 없다. 
		
		//package, protected, public 접근 지정자로 선언된 멤버 필드는 접근이 가능
		mc.packageInt = 10;
		mc.protectedInt = 10;
		mc.publicInt = 10;
		
		//mc.privateMethod();
		//- The method privateMethod() from the type MyClass is not visible
		//private 접근 지정자로 선언된 멤버 메서드는 행당 클래스 외부에서 접근할 수 없음
		
		mc.packageMethod();
		mc.protectedMethod();
		mc.publicMethod();
		//외부에서 접근가능
	}

}
