package sec01;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {
	
	private int pno;
	private String name;
	private String company;
	private int price;
	
	@Override
	public String toString() {
	
		return new StringBuilder().append("{")
				.append("pno:" + pno + ",")
				.append("name:" + name + ",")
				.append("company:" + company + ",")
				.append("price:" + price ).append("}").toString();
	}

}
