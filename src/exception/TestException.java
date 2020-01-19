package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("c:/a.txt");
			System.out.println("step 1");
			char str = (char)reader.read();
			System.out.println(str);
			
		}catch(FileNotFoundException e) {
			System.out.println("step 2");
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("step 3");
			try {
				if(reader!=null) {
					reader.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
