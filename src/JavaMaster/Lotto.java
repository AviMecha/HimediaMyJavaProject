package JavaMaster;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lotto {

	public static void main(String[] args) {
		Date now = new Date();
		System
		
		
		.out.println(now.toString());
	                                            
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(now));
		
	}
}