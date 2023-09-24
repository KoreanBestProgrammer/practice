package project_practice;

public class SawonProcess {
	public void sawonDataPrint(Sawon sa[],int cnt) {
		System.out.println("성명\t출장비\t오만\t일만\t오천\t일천\t오백\t일백\t오십\t일십\t오\t일");
		int sum=0;
		for(int i=0;i<cnt;i++) {
			sa[i].sawonPrint();
			int m=sa[i].pay;
			int m1=(int)(m/50000);
	        int m2=(m%50000)/10000;
	        int m3=(m%10000)/5000;
	        int m4=(m%5000)/1000;
	        int m5=(m%1000)/500;
	        int m6=(m%500)/100;
	        int m7=(m%100)/50;
	        int m8=(m%50)/10;
	        int m9=(m%10)/5;
	        int m10=(m%5)/1;
	        System.out.print(m1+"\t"+m2+"\t"+m3+"\t"+m4+"\t"+m5+"\t"+m6+"\t"+m7+"\t"+m8+"\t"+m9+"\t"+m10+"\n");
	        sum+=sa[i].pay;
		}
		int s=sum;
		int s1=(int)(s/50000);
        int s2=(s%50000)/10000;
        int s3=(s%10000)/5000;
        int s4=(s%5000)/1000;
        int s5=(s%1000)/500;
        int s6=(s%500)/100;
        int s7=(s%100)/50;
        int s8=(s%50)/10;
        int s9=(s%10)/5;
        int s10=(s%5)/1;
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.print("합계"+"\t"+sum+"\t"+s1+"\t"+s2+"\t"+s3+"\t"+s4+"\t"+s5+"\t"+s6+"\t"+s7+"\t"+s8+"\t"+s9+"\t"+s10+"\n");
	}
}
	
