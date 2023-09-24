package project_practice;

import java.util.Scanner;

public class J0112_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		for(int k = 1; true; k++) {System.out.println("ผ๖ภิทย?"); 
		                            int input = sc.nextInt();
		                            if(input == 0) break;
		                            num += input;} //num = num + input;
		                            
		                            System.out.println("รัวี : "+num);

	}

}
