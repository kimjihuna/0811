/*
 * 사용자 정의형 exception
 * 1. 누구의 자식인가? runtimeException 계열인가 아닌가 
 * 2. 생성자를 잘 만들자
 * 
 */
public class KoreanException extends RuntimeException {
	 public KoreanException(String msg) {
		 super(msg);
	 }
}
