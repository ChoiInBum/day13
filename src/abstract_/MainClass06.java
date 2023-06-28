package abstract_;

class A06 {
	public void a() {}
}

class B06 extends A06 {
	public void b() {}
	public void a() {}
}

class C06 extends A06 {
	public void c() {}
}

public class MainClass06 {
	public static void main(String[] args) {
		B06 b = new B06();
		A06 c = new C06();
		b.a();
	}
}