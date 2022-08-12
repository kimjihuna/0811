/*
 * method's override 조건 3가지
 * 이름 리턴타입 괄호가같아야 한다.
 * 메소드의 접근제한자는 부모보다 같거나 더 넓어야 한다.
 * 자식의 exception은 부모의 exception보다 더 적어야 한다.
 */


public abstract class Mammal {
	public abstract void saySommething() throws RuntimeException;
}
