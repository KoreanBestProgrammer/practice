package project_practice;

import java.util.Scanner;

public class J0116_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� ? ");
		int count = sc.nextInt();
		
		int score[] = new int[count];
		
		for(int k = 0 ; k < count ; k++) {System.out.println((k+1)+"��° ���� ? ");
		                                  score[k] = sc.nextInt();
		}
         //���
		int total=0;
		for(int k = 0 ; k < count ; k++) {System.out.print(score[k]+ "\t");
		                                  total += score[k];
		}
		
		
		
			
		System.out.println("���� : "+total);
	

}
}