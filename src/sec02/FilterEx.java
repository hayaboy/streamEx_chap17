package sec02;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {
	
	public static void main(String[] args) {
		
		List<String> arrList=new ArrayList<>();
		arrList.add("홍일동");
		arrList.add("홍일동");
		arrList.add("홍삼동");
		arrList.add("신삼동");
		
		
		arrList.stream().distinct().forEach((x)->{System.out.println(x);});
		
		
		System.out.println("============");
		
		//Predicate는 boolean을 리턴
		
		arrList.stream().filter((x)->{ return x.startsWith("신");}).forEach((x)->{System.out.println(x);});
	}

}
