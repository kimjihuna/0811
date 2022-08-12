
public class ExceptionDemo2 {
	public static void main(String[] args) {
		a();
	}

	static void a() {
		try {
		b();
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("여기서 잡았음");
		}
	}

	static void b() {
		c();
	}

	static void c() {
		d();
	}

	static void d() {
		System.out.println(5 / 0);
	}
}
