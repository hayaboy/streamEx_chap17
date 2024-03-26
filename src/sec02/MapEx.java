package sec02;

import java.util.Arrays;

public class MapEx {

	public static void main(String[] args) {

		int intArr[]= {1,2,3,4,5};
		
		
		Arrays.stream(intArr).forEach(x->{System.out.println(x);});
		
		Arrays.stream(intArr).asDoubleStream().forEach(x->{System.out.println(x);});

	}

}
