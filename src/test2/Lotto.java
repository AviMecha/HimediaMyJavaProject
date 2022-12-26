package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
	
		System.out.println("lotto 로또 프로그램 (랜덤 번호 생성 및 당첨 확인)");
		int lotto[] = {3, 5, 24, 32, 10, 9};
		
		Random random = new Random();
		int number[] = new int[6];
		Arrays.fill(number, 0);
		
		int idx = 0;
		while(true) { 
			int zero = 0;
			for(int i=0; i<number.length; i++) {
				if(number[i] == 0) {
					zero ++;
				}
			}	if(zero <= 0) {				
				break;
			} else {
				int random_number = random.nextInt(45)+1;
				int check = 0;
				for(int k=0; k<number.length; k++) {
					if(number[k] == random_number) {
						check ++;
					}
				}
				if(check <= 0) {
					number[idx] = random_number;
					idx ++;
				}
				
				System.out.println("사용자 로또 번호 : "+Arrays.toString(number));
				int count = 0;
				for(int j=0; j<lotto.length; j++) { //로또 정답 배열
					for(int h=0; h<number.length; h++) { //사용자 로또 번호 배열
			
						if(lotto[j] == number[h]) { 
							count ++; //사용자 로또 배열 값이 로또 정답 배열 값이랑 같은게 있을 경우 count 증가
						}
					}
				}
				System.out.println("맞힌 개수 : "+count);
				
				if(count == 6) {
					System.out.println("등수 : "+"1등 입니다");	
				}
				else if(count == 5) {
					System.out.println("등수 : "+"2등 입니다");
				}
				else if(count == 4) {
					System.out.println("등수 : "+"3등 입니다");
				}
			
				else {
					System.out.println("등수 : "+"꽝 ... 입니다");
				}
			}
			}
	}
}
