package JavaMaster;

import java.text.DecimalFormat;

public class DecimalformatExample {

	public static void main(String[] args) {
		double number = 1234567.89;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");
		System.out.println(df.format(number));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(number));
		
		
			

	}

}
