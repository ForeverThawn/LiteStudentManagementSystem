package manager;

public class StudentDatabase extends BasicDatabase {
	// Student student = new Student(id, name, gender, chinese, math, english,
	// computer);
	private String id;
	private String name;
	private String gender;

	private double chinese;
	private double math;
	private double english;
	private double computer;

	public StudentDatabase(String id, String name, String gender, double chinese, double math, double english,
			double computer) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getChinese() {
		return chinese;
	}

	public void setChinese(double chinese) {
		this.chinese = chinese;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getComputer() {
		return computer;
	}

	public void setComputer(double computer) {
		this.computer = computer;
	}
}
