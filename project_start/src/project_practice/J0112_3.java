package project_practice;

import java.util.Scanner;

public class J0112_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ��?");
		String month = sc.next();
		int mont = Integer.parseInt(month);
		
		
		
		String season = "";
		switch(mont) { case 1 : case 2 : case 12 : 
			            season = "�ܿ�";	
			            break;
		                case 3 : case 4 : case 5 :
		                season = "��";	
		                break;
		                case 6 : case 7 : case 8 :
		                season = "�ܿ�";	
		                break;
		                case 9 : case 10 : case 11 :
		                season = "����";	
		                break;
		                default:
		                season = "�Է¿���"; }
		                
		                                   
                       System.out.println("���� : "+season);
	}

}
