package sec04;

public class Student implements Comparable<Student>{
	
	private String name;
	private String sung;
	private int score;

	public String getSung() {
		return sung;
	}

	public void setSung(String sung) {
		this.sung = sung;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String sung, int score) {
		super();
		this.name = name;
		this.sung = sung;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student stu) {		
		return Integer.compare(this.score, stu.score);
	}
	
	
	
	
}
