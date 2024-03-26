package sec01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamEx3 {

	public static void main(String[] args) {
		
		//기존 방식(반복문 사용)
		Map<String, String> arrList1	=new HashMap<>();
		arrList1.put("a","apple");
		arrList1.put("b","banana");
		arrList1.put("c","cat");
			
		System.out.println(arrList1);
		
		
		System.out.println(arrList1.get("a"));
		
		
		
	}

}
