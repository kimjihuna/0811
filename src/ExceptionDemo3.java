
public class ExceptionDemo3 {
	public static void main(String[] args) {
		 Test t = new Test();
		 t= null;
		 try {
			 t.display();
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}



class Test{
	public void display() {
		System.out.println("Hello, World");
	}
}