package project_practice;

import java.util.Scanner;

public class J0112_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�г�");
		int grade = sc.nextInt();
		
	    System.out.println("���");
	    double ave = sc.nextDouble();
	    
	    String result = "���հ�";
	    
	    if((grade <= 3 && grade >=1) && (ave >=70)) result = "�հ�";
	    else if((grade <=6 && grade >=4) && (ave >=80)) result = "�հ�";
	    else if(grade > 6 || grade < 1 ) result = "�Է¿���";
	    
	    System.out.println("��� : "+result);

	

}
}