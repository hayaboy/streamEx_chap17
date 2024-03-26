package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ScoreTest {

	public static void main(String[] args) {
		
		List<Student> stuList= 	new ArrayList<Student>();
		
		
		stuList.add(new Student("홍일동", 100));
		stuList.add(new Student("홍이동", 90));
		stuList.add(new Student("홍삼동", 100));
		
		//1)기존 방식
		//총합
		int total=0;		
		for(int i=0;i<stuList.size();i++) {
			Student stu=stuList.get(i);
			total +=stu.getScore();
		}
				
		System.out.println("총합 : " + total);		
		System.out.printf("평균 : %.2f\n" ,  (double)total /stuList.size() );

		System.out.println("=======================");
		
		//2)스트림 방식		
		Stream<Student> stuStream= stuList.stream();		
		//stuStream.forEach( (obj) -> {System.out.println(obj.getName()+" " + obj.getScore());} );
		System.out.println("=======================");
		
		//스트림 파이프 라인
		
//		int total2=stuStream.mapToInt((obj)->{return obj.getScore();}).sum();
//		System.out.println(total2);
		
		
		
		double avg=stuStream.mapToInt((obj)->{return obj.getScore();}).average().getAsDouble();		
		System.out.printf("평균 : %.2f\n" ,avg);
		
	}

}
