package project_practice;

import java.util.Scanner;

public class J0117_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 과목 ? ");
		int count = sc.nextInt();
		
		int score[] = new int[count+2];
		
		int total = 0;
		for(int k = 0 ; k < count ; k++ ) {
			System.out.println((k+1)+"번째 과목");
			score[k] = sc.nextInt();
			total = total + score[k];
		}
		int ave = total/count;
		
		score[count] = total;
		score[count+1] = ave;
        for(int k = 0 ; k < score.length ; k++) {
        	System.out.println(score[k]);
        }
        
	}
	

}
