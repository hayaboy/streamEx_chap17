package sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapEx {

	
	public static void main(String[] args) {
		
		List<String> arrList=new ArrayList<>();
		arrList.add("this is java");
		arrList.add("i am a best developer");		
		
		arrList.stream().flatMap((x)->{return Arrays.stream(x.split(" "));}).forEach((x)->{System.out.println(x);});
	}
}
