
public class WrapperClassDemo {
	public static void main(String[] args) {
		//until jdk 1.4
//		int age = 26; //stack
//		Integer in = new Integer(age);
//		int su = in.intValue()	;
//		System.out.println("su = "+su);
		
		//since jdk1.5
		Integer in = 26+5;  				//Interger in = new integer
		int su = in +100;
		System.out.println("su = "+ su);
	}
}
