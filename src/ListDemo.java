import java.util.Stack;

/*
 * Stack : LIFO Last Input First Out
 * 
 */
public class ListDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String[] array = {"박지민", "홍지민" ,"박지민", "한지민", "한지민", "이지민"};
		for (String string : array) {
			stack.push(string);
		}
//		System.out.println(stack.peek()); System.out.println(stack.size());
//		System.out.println(stack.peek()); System.out.println(stack.size());
//		System.out.println(stack.peek()); System.out.println(stack.size());
		System.out.println(stack.search("김지민"));
	}
}
