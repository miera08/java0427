class A{
	int a=10;
	int b=20;
	public void doA() {
		System.out.println("doA 메서드입니다");
		
	}
	public void doB() {
		System.out.println("doB 메서드입니다");
	}
}
class B{
	int a=10;
	int b=20;
	public void doA() {}
	public void dob() {}
}
class C{}
class D{}
public class Ex03 {
	public static void main(String[] args) {
		A a= new A();
		a.doA();
		a.doB();
		System.out.println("a.a"+a.a);
		System.out.println("a.b"+a.b);
		
	}
}
