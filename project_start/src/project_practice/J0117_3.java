package project_practice;

import java.util.Scanner;

public class J0117_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"홍길동","50","60","70","80","90","100","100"};
		
		for(int k = 1 ; k < str.length ; k++) {
			System.out.println(str[k]);
		}
				         
        String score[] = new String[str.length+1];
        int total = 0;
        for(int k = 0 ; k < str.length ; k++) {
        	score[k] = str[k];
        	if(k > 0) total = total + Integer.parseInt(str[k]);
        	
        }
         score[str.length] = Integer.toString(total);
         
         for(int k = 0 ; k < score.length ; k++) {
        	 System.out.println(score[k]+"\t");
         }
	}
    
}
