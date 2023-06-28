package overriding;

class Test {
	public void test() { }
}

class TestClass05 extends Test {
	
}

public class MainClass05 {
	public static void main(String[] args) {
		TestClass05 t = new TestClass05();
		System.out.println("aaa".getClass());
		System.out.println(t.getClass());
		System.out.println(t.toString());
	}
}