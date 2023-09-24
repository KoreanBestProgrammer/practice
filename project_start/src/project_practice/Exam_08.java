package project_practice;

import java.util.Scanner;

/* 키보드 점수(1~100 사이) 입력 받아서 합계점수, 평균점수, 최대점수, 최소점수를 구하여 
 * 출력하는 프로그램 9단, 입력되는 점수가 (1~100사이) 해당하면 최대, 최소, 합계에서 제외하면
 * -99이면 출력 후 종료)
 * [입력예시]
 * 점수입력 : 79 0 88 90 0 67 59 0 95 68 -99
 * [출력예시]
 * 최대점수 : 95 
 * 최소점수 : 59
 * 합계 : 546
 * 평균 : 78
 */
public class Exam_08 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		
		System.out.println("몇개");
		int count = scn.nextInt();
	
		
		int total = 0;
		for(int k = 0 ; k < count ; k++ ) {
			System.out.println("입력 할 수");
			int number = scn.nextInt();
			
		}
		
		
		
		/*while(true) {
			v=scn.nextInt();
			if(v==-99) 
				break;
			if(v>=1&&v<=100) {
				t+=v;
				c++;
			
			}
		}
		*/
		
	}

}
