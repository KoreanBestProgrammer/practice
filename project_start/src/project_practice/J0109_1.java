package project_practice;

import java.util.Scanner;

public class J0109_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	    System.out.println("���� ����?");
		int kor = sc.nextInt();
		
		System.out.println("���� ����?");
		int mat = sc.nextInt();
		
		System.out.println("���� ����?");
		int eng = sc.nextInt();
		
		int total = kor+mat+eng;
		
		int ave = total/3;
		
		String result = "";
		
		if(ave > 100 || ave < 0) {System.out.println("�����Է¿���");}
		else if(ave >= 90) {result = "a";}
		else if(ave >= 80) {result = "b";}
		else {result = "f";}
		
		
		System.out.println("���� : "+total);
		System.out.println("��� : "+ave);
		System.out.println("��� : "+result);
		
		
		
		
		
		
		
		
		/*System.out.print("ù��° ��");
		int f = sc.nextInt();
		
		System.out.print("������");
		String a = sc.next();
		
		System.out.print("�ι�° ��");
		int s = sc.nextInt();
		
		int result = 0;
		
		if(a.equals("+")) {result = f+s;}
		else if (a.equals("-")) {result = f-s;}
		else if (a.equals("*")) {result = f*s;}
		else if (a.equals("/")) {result = f/s;}
		else {System.out.println("�������");}
	
		System.out.println("��� : "+result);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
				

	}

}
