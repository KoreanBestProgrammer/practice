package project_practice;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		BaseballProcess bp=new BaseballProcess();
		Scanner scn=new Scanner(System.in);
		int computer[]=new int[3];
		for(int i=0;i<computer.length;i++) {
			computer[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(computer[i]==computer[j]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			System.out.print("입력:");
			String str=scn.next();
			int answer[]=new int[3];
			answer[0]=Integer.parseInt(str.substring(0,1));
			answer[1]=Integer.parseInt(str.substring(1,2));
			answer[2]=Integer.parseInt(str.substring(2));
			int strike=0;
			int ball=0;
			if(answer[0]==computer[0]) strike++;
			if(answer[1]==computer[0] || answer[2]==computer[0]) ball++;
			if(answer[1]==computer[1]) strike++;
			if(answer[0]==computer[1] || answer[2]==computer[1]) ball++;
			if(answer[2]==computer[2]) strike++;
			if(answer[0]==computer[2] || answer[1]==computer[2]) ball++;
			if(strike==3) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
			}
			System.out.println("결과:"+strike+"스트라이크 "+ball+"볼");
			
		}
		
	}

}
