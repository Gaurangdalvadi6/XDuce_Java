package oopsConcept;
// 11/4/2024
class Pen{
	private String color;
	private int tip;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	void setTip(int newTip) {
		tip = newTip;
	}
	
	public int getTip() {
		return this.tip;
	}
}


public class OOPS_Basics {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.setColor("red");
		System.out.println(p1.getColor());
		p1.setTip(1);
		System.out.println(p1.getTip());
		
//		BankAccount bankAccount = new BankAccount();
//		bankAccount.setPassword("java");
//		
//		System.out.println(bankAccount.name);
	}
}

class BankAccount{
	public String name;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
//	void setPassword(String newPassword) {
//		password = newPassword;
//	}
}


