package sec02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrToStreamEx {

	
	static int tot=0;
	
	public static void main(String[] args) {
		
		
		String strArr[]= {" 홍일동 ","홍이동 "," 홍삼동"};
		
		int strArr2[]= {4,6,8};
		
		//기존 방식
//		for(String str : strArr) {
//			System.out.println(str);
//		}
		
		System.out.println("=================");
		//strArr.stream
		
		
		//Arrays 이 클래스에는 배열을 조작하기 위한 다양한 메서드(예: 정렬 및 검색)가 포함되어 있습니다.
//		Stream<String> stream=Arrays.stream(strArr);
//		//System.out.println(stream);		
//		stream.forEach((x)->{System.out.println(x);});
		
		System.out.println("=================");
		//IntStream stream2=Arrays.stream(strArr2);
		//System.out.println(stream);		
		//stream2.forEach((x)->{System.out.println(x);});
		
		
		
		//IntStream stream3=IntStream.rangeClosed(1, 100);
		//System.out.println(stream3);
		
		//stream3.forEach((x)->{System.out.print(x);});
		System.out.println("=================");
		
		IntStream stream4=IntStream.rangeClosed(1, 10);
		//System.out.println(stream3);
		
		
//		stream4.forEach((x)->{
//			tot +=x;
//			//System.out.print(x);
//			});
//		
//		System.out.println(tot);
		
		System.out.println(stream4.sum());
	}
}
