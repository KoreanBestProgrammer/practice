package project_practice;

import java.util.Scanner;

public class J0116_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����̸� ? ");
		String search = sc.next();
		
		
		
		
		 String[] name = { "�̻��", "�ڸ���", "������", "�輺��", "������", 
                 "���μ�", "�Ȼ��", "�̹̿�", "������", "������", 
                 "����", "���̿�", "��̼�",   "������", "�ӹμ�", 
                 "������", "������", "�ּ���", "�۹μ�", "������", 
                 "���α�", "�Ű���", "���ؿ�", "������", "�Ȱ���" };
		 
		 int count = 0;		 
		 for(int k = 0 ; k < name.length ; k++ ) { 
			 if(name[k].indexOf(search) != -1) count++;
		 }
		 
		 System.out.println(count);
		 

	}

}
