package project_practice;

public class Sawon {
	String name;
	int pay;
	
	public Sawon() {}
	public Sawon(String name,int pay) {
		this.name=name;
		this.pay=pay;
	}
	public void sawonPrint() {
		System.out.print(name+"\t"+pay+"\t");	
	}
	
}
