package oopsConcept;
// 11/4/2024
interface B{
	void a();
	void b();
	void c();
	void d();
	void e();
}

abstract class C implements B{
	public void c() {
		System.out.println("I am in c");
	}
}

class M extends C{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("i am in a");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("I am in b");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("I am in d");
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		System.out.println("I am in e");
	}
	
}
public class Interface_Example2 {
	public static void main(String[] args) {
		M m = new M();
		m.a();
		m.b();
		m.c();
		m.d();
		m.e();
	}
}