import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int second = sc.nextInt();
		try {
			System.out.printf("%d / %d = %d\n", first, second, (first / second));
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("여기서 잡았다");
		}
		/*
		 * multiple catch block : 여러개의 exception type을 열거하는 방법
		 *  - 주의할 점 : 위아래 순서가 있다. 위쪽은 자식 exception, 아래쪽은 부모 exception
		 */
		
		
		
	}
}
