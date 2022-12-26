package test2;

public class FinalTest {

class A1 { 
	int a = 3;
	final int b = 5;
}

class A2 {
	int a;
	final int b;
	A2() {
		this.a = 3;
		this.b = 5;			//선언만한 경우 초기화가능
	}
}

class A3 {
	int a = 3;
	final int b = 5;
	A3() {
		this.a = 30;
//		this.b = 50;		//선언과 할당이 되었다면 초기화불가능
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
