package project_practice;

import java.util.Scanner;

public class J0112_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �ܺ���?");
		int start = sc.nextInt();
		System.out.println("�� �ܱ���?");
		int end = sc.nextInt();
		
		for(int k = start; true; k++) {for(int j = 1; j <=9; j++){System.out.println(k+" * "+j+" = "+k*j);}}
			                                                                                                 

	}

}
