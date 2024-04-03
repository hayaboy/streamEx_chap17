package sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AggregateEx {

	public static void main(String[] args) {
		int intArr[]= {1,2,3,4,5};
		
		
		System.out.println(Arrays.stream(intArr).filter((x)->{return x%2==0;}).count());

		
		System.out.println(Arrays.stream(intArr).filter((x)->{return x%2==0;}).sum());
		
		
		System.out.println(Arrays.stream(intArr).filter((x)->{return x%2==0;}).average());
		System.out.println(Arrays.stream(intArr).filter((x)->{return x%2==0;}).average().getAsDouble());
		
		System.out.println(Arrays.stream(intArr).filter((x)->{return x%2==0;}).max());
		System.out.println(Arrays.stream(intArr).filter((x)->{return x%2==0;}).max().getAsInt());
		
		System.out.println(Arrays.stream(intArr).filter((x)->{return x%2==0;}).min());
		System.out.println(Arrays.stream(intArr).filter((x)->{return x%2==0;}).min().getAsInt());
		
		System.out.println("=========================");
		
		int intArr2[]=new int[3];		
		System.out.println(intArr2[0]);
		System.out.println(intArr2[1]);
		System.out.println(intArr2[2]);		
		System.out.println(Arrays.stream(intArr2).sum());
		
		System.out.println("##########################");
		
		List<Integer> listArr3=new ArrayList<>();
		
		listArr3.add(5);
		listArr3.add(6);
		listArr3.add(7);
		System.out.println(listArr3);
		
		System.out.println(listArr3.stream().count());
		double avg=listArr3.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);
	}

}
