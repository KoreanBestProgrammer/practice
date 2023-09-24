package project_practice;

import java.util.Scanner;

public class J0112_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자");
		int start = sc.nextInt();
		System.out.println("끝 숫자");
        int end = sc.nextInt();
        
        
        int total = 0;
        for(int k=start; k<=end; k++) {total = total + k;} //total += k;
        
                             System.out.println("total : "+total);
	}

}
	
	
	/*k+t=t
	1+0=1
    2+1=3
    3+3=6
    4+6=10
    5+10=15
    6+15=21
    7+21=28
    8+28=36
    9+36=45
    10+45=55*/
    
    
    
