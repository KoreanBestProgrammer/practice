package project_practice;

import java.util.Scanner;

public class J0116_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�� ��? ");
		int count = sc.nextInt();
		
		String name[] = new String[count];
		
		for(int k = 0 ; k < count ; k++) {System.out.println((k+1)+"���� ����");
		                                  name[k] = sc.next();
		}
         //��� 
		for(int k = 0 ; k < count ; k++) System.out.println("���� : "+name[k]);
		
		
		System.out.println("����̸� ? ");
		String search = sc.next();
		
		int count1 = 0;
		for(int k = 0 ; k < count ; k++) {
			if(name[k].indexOf(search) != -1) count1++;
		}
		 System.out.println(count1);
	}

}
