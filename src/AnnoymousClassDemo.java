
public class AnnoymousClassDemo {
	public static void main(String[] args) {
		Demo d = new Demo() {
			@Override
			public void display() {
				System.out.println("나는 재정의된 메소드");
			}
			public void print() {
				System.out.println("나는 새로운 메소드");
			}
		}; // 매우 주의할 것
		d.display();
//		d.print()   //재정의할려는 클래스에 멤버가 아니라 사용할수 없다.
	}
}

class Demo {
	public void display() {
		System.out.println("나는 원형 메소드");
	}
}
