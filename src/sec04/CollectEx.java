package sec04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx {

	public static void main(String[] args) {
	
		
		// 컬렉션을 스트림으로 컬렉션객체.stream()
		// 배열을 스트림으로  Arrays.strema()
		
		
		List<Student> stuList=	Arrays.asList(new Student("홍일동","남", 92 ),
				new Student("홍이동","여", 87),
				new Student("홍삼동","남", 95),
				new Student("홍사동","여", 93));
		
		
		 List<Student> resultList=stuList.stream().filter((x)->{return x.getSung().equals("남");}).collect(Collectors.toList());
		 //System.out.println(resultList);		
		 //resultList.stream().forEach((x)->{System.out.println(x.getName());});

		 
		 List<Student> resultList2=stuList.stream().filter((x)->{return x.getSung().equals("여");}).toList();
		
		 resultList2.stream().forEach((x)->{System.out.println(x.getName());});
		 
		 
		 Map<String, Integer> map1=stuList.stream().filter((x)->{return x.getSung().equals("남");})
		 .collect(Collectors.toMap((x)->{return x.getName();},(x)->{return x.getScore();}));
		 
		 System.out.println(map1.get("홍삼동"));
		 
		 System.out.println("============");
		 
		 //groupingBy
		 Map<String, List<Student>>  map2=  stuList.stream().collect(Collectors.groupingBy((x)->{return x.getSung();}));
		 //System.out.println(map2.get("남"));
		 map2.get("남").stream().forEach((x)->{System.out.println(x.getName());});
		 
		 
		 //남여별 평균
		 
		 Map<String, Double> map = stuList.stream().collect(Collectors.groupingBy(
				 (x)->{return x.getSung();}, 
				 Collectors.averagingDouble((obj)->{return obj.getScore();}))
				 );
		 
		 System.out.println(map);
	}

}
