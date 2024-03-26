package sec02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStreamEx {

	public static void main(String[] args) {
		
		Path path=Paths.get("C:\\Users\\Administrator\\eclipse-workspace\\chap17\\data.txt");
		System.out.println(path);
		
		try {
			Stream stream=Files.lines(path);
			
			stream.forEach((x)->{System.out.println(x);});
		} catch (IOException e) {
			System.out.println("파일 읽는 도중 예외");
//			e.printStackTrace();
		}
		

	}

}
