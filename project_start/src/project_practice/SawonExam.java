package project_practice;

import java.util.Scanner;

public class SawonExam {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Sawon sawon[]=new Sawon[10];
		int cnt=0;
		while(cnt<10) {
			System.out.print("사원등록:");
			String name=scn.next();
			if(name.equals("end")||name.equals("END")) {
				break;
			}
			int pay=scn.nextInt();
			sawon[cnt]=new Sawon(name,pay);
			cnt++;
		}
		SawonProcess s=new SawonProcess();
		s.sawonDataPrint(sawon, cnt);
		
	}

}
