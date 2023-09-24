package project_practice;

import java.util.Scanner;

public class J0112_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학년");
		int grade = sc.nextInt();
		
	    System.out.println("평균");
	    double ave = sc.nextDouble();
	    
	    String result = "불합격";
	    
	    if((grade <= 3 && grade >=1) && (ave >=70)) result = "합격";
	    else if((grade <=6 && grade >=4) && (ave >=80)) result = "합격";
	    else if(grade > 6 || grade < 1 ) result = "입력오류";
	    
	    System.out.println("결과 : "+result);

	

}
}