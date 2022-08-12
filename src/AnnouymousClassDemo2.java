
public class AnnouymousClassDemo2 {
	public static void main(String[] args) {
		AnnouymousClassDemo2 acd = new AnnouymousClassDemo2();
//		acd.exec(acd.new MyClass());
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a + b;
			}
		});
		acd.exec(new MyInterface() {

			@Override
			public int calculate(int a, int b) {
				// TODO Auto-generated method stub
				return a * b;
			}
		});

		acd.exec(new MyInterface() {

			@Override
			public int calculate(int a, int b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		});

		acd.exec(new MyInterface() {

			@Override
			public int calculate(int a, int b) {
				// TODO Auto-generated method stub
				return a / b;
			}
		});

	}

	void exec(MyInterface mi) { // member method
		int result = mi.calculate(5, 9);
		System.out.println("result = " + result);
	}

//	class MyClass implements MyInterface { // member class
//		@Override
//		public int calculate(int front, int back) {
//			return front + back;
//		}
//
//	}

//	class MyMultiple implements MyInterface { // member class
//		@Override
//		public int calculate(int front, int back) {
//			return front * back;
//		}
//
//	}
//	
//	class MyPlus implements MyInterface { // member class
//		@Override
//		public int calculate(int front, int back) {
//			return front + back;
//		}
//
//	}
//	
//	class MyDivid implements MyInterface { // member class
//		@Override
//		public int calculate(int front, int back) {
//			return front / back;
//		}
//
//	}

}

@FunctionalInterface
interface MyInterface {
	int calculate(int front, int back);
}
