package sec03;

import java.util.Arrays;

public class LoopingEx2 {

	public static void main(String[] args) {
		int intArr[]= {2,4,6};
		
		
		System.out.println(Arrays.stream(intArr).allMatch((x)->{
			
			return x%2==0;}));
		
		System.out.println(Arrays.stream(intArr).anyMatch((x)->{			
			return x%3==0;}));
	
		System.out.println(Arrays.stream(intArr).noneMatch((x)->{			
			return x%3==0;}));
	}

}
