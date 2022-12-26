package test.graphic;

public class GraphicApplication {

	public static void main(String[] args) {
		
/*		// A 그래픽 카드를 사용하는 경우
		Graphic_A g1 = new Graphic_A();
		g1.brightness_A(100);
		g1.contrast_A(50.0);
		g1.display_A();

		//B 그래픽 카드를 사용하는 경우
		Graphic_B g2 = new Graphic_B();
		g2.brightness_B(100);
		g2.contrast_B(50.0);
		g2.display_B();
				
		//일일이 바꿀려면 좆귀찮아진다 
		//그래서 인터페이스를 사용한다 	*/
		
		Graphic g3 = new Graphic_A();
		g3.brightness(100);
		g3.contrast(50.0);
		g3.display();
	}

}
