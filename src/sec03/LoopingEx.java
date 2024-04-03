package sec03;

import java.util.Arrays;

public class LoopingEx {

	public static void main(String[] args) {
		int intArr[]= {1,2,3,4,5};
		
		int tot=Arrays.stream(intArr).filter((x)->{return x%2==0;}).sum();
		System.out.println(tot);
		//forEach((x)->{System.out.println(x);});
		
		System.out.println("################");
		
		int total =Arrays.stream(intArr).filter((x)->{return x%2==0;}).peek((x)->{System.out.println(x);}).sum();
		System.out.println("=================");
		System.out.println(total);
		
		//Arrays.stream(intArr).filter((x)->{return x%2==0;}).peek((x)->{System.out.println(x);});
	

	}

}
