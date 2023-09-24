package project_practice;

public class BaseballProcess {
	 public int solution(int[][] baseball) {
		 int answer = 0;
	        for(int i=1; i<=9; i++) {
	        	for(int j=1; j<=9; j++) {
	        		for(int k=1; k<=9; k++) {
	        			if(i==j || j==k || i==k) continue;
	        			int comp = 0;
	        			for(int[] base : baseball) {
	        				int one = base[0]/100;
	        				int two = base[0]%100/10;
	        				int three = base[0]%10;
	        				int strike = 0;
	        				int ball = 0;
	        				if(one==i) strike++;
	        				if(two==i || three==i) ball++;
	        				if(two==j) strike++;
	        				if(one==j || three==j) ball++;
	        				if(three==k) strike++;
	        				if(one==k || two==k) ball++;
	        				
	        				if(base[1]==strike && base[2]==ball) comp++;
	        			}
	        			if(comp==baseball.length) answer++;
	        		}
	        	}
	        }
	        System.out.println(answer);
	        return answer;
	    }
}
