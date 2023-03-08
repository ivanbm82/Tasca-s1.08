package n3exercici1;

public class Alumnos {
	
	private String name;
	private int age;
	private String course;
	private int qualification;
	
	public Alumnos(String name, int age, String course, int qualification) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.qualification = qualification;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * @return the grade
	 */
	public int getQualification() {
		return qualification;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setQualification(int qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Alumnos [name=" + name + ", age=" + age + ", course=" + course + ", qualification=" + qualification + "]";
	}
	
	
	

}
