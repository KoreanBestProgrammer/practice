package project_practice;

import java.util.Scanner;

public class J0117_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 과목 ? ");
		int count = sc.nextInt();
		
		String score[] = new String[count];
		
		int total = 0;
		for(int k = 0 ; k < count ; k++) {
			System.out.println((k+1)+"번째 과목");
			score[k] = sc.next();
			total = total+Integer.parseInt(score[k]);
			
		}
      for(int k = 0 ; k < score.length ; k++) {
    	  System.out.println(score[k]+"\t");
      }
      System.out.println("총점 : "+total);
	}

}
