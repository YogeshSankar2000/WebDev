package test;

public class Company extends Employee {
	
	public Company() {
		this(20);
		System.out.println("Single Paremeter");
	}
	public Company(int a) {
		this(20,'M',"Yogesh");
		System.out.println("Double Parameter");
	}
	public Company(int a, char gender, String name) {
		super();
		System.out.println("Three Parameter");
	}
	public static void main(String[] args) {
		Company c = new Company();
	}
}
