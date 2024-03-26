package sec01;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		
		//기존 방식(반복문 사용)
		Set<String> arrList1	=new HashSet<>();
		arrList1.add("a");
		arrList1.add("b");
		arrList1.add("c");
			
		for(String str : arrList1) {
			System.out.println(str);
		}
		
		System.out.println("====================");		
		
		Stream<String> arrListStream2=	arrList1.stream();		
		arrListStream2.forEach( (x) -> { System.out.println(x);} );
		
	}

}
