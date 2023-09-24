package project_practice;

import java.util.Scanner;

public class J0117_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 과목?");
		int count = sc.nextInt();
		
		String score[] = new String[count+2];
		
		int total = 0;
		for(int k = 0 ; k < count ; k++) {
			System.out.print((k+1)+"번째 과목");
			score[k] = sc.next();
			total = total + Integer.parseInt(score[k]);
		}
      int ave = total/count;
      
      score[count] = Integer.toString(total);
      score[count+1] = Integer.toString(ave);
    		  
      for(int k = 0 ; k < score.length ; k++) {
    	  System.out.print(score[k]+"\t");
    	 
      }
      
      
	}

}
