package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		
		//기존 방식(반복문 사용)
		List<Integer> arrList1	=new ArrayList<>();
		arrList1.add(5);
		arrList1.add(6);
		arrList1.add(9);
			
		for(int str : arrList1) {
			System.out.println(str);
		}
		
		System.out.println("====================");	
		
		//새로운 방식(스트림 사용)
		Stream<Integer> arrListStream2=	arrList1.stream();		
		arrListStream2.forEach( (x) -> { System.out.println(x);} );
		
	}

}
