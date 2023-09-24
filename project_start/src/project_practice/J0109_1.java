package project_practice;

import java.util.Scanner;

public class J0109_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("국어 점수?");
		int kor = sc.nextInt();
		
		System.out.println("수학 점수?");
		int mat = sc.nextInt();
		
		System.out.println("영어 점수?");
		int eng = sc.nextInt();
		
		int total = kor+mat+eng;
		
		int ave = total/3;
		
		String result = "";
		
		if(ave > 100 || ave < 0) {System.out.println("점수입력오류");}
		else if(ave >= 90) {result = "a";}
		else if(ave >= 80) {result = "b";}
		else {result = "f";}
		
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+ave);
		System.out.println("결과 : "+result);
		
		
		
		
		
		
		
		
		/*System.out.print("첫번째 수");
		int f = sc.nextInt();
		
		System.out.print("연산자");
		String a = sc.next();
		
		System.out.print("두번째 수");
		int s = sc.nextInt();
		
		int result = 0;
		
		if(a.equals("+")) {result = f+s;}
		else if (a.equals("-")) {result = f-s;}
		else if (a.equals("*")) {result = f*s;}
		else if (a.equals("/")) {result = f/s;}
		else {System.out.println("결과오류");}
	
		System.out.println("결과 : "+result);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
				

	}

}
