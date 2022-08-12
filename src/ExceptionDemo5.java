/*
 * close()는 반드시 파일을 열거나 db를 열었을때 처리해야한다.
 * 그러기 위해서 finally 블록에 close()를 사용한다
 * 하지만 , finally블록이 너무 코드가 길어지기 때문에
 * autocloseable 인터페이스의 자식들은 finally 안에 close를 할 필요가 없기 때문에finally block은 사용하지 않아도 된다
 * 이때 try block이 모두 끝나면 자동으로 해당 객체의 close가 일어난다 
 * 
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader("C:/Temp/sungjuk_utf8.dat"));
			while ((line = br.readLine()) != null) {
					System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
