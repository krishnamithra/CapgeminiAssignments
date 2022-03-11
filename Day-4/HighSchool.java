package justfornow;

class Person{
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Student extends Person{
	String id;
	
	public Student(String name,String id) {
		super(name);
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
}

class Teacher extends Person{
	private double salary;
	String subject;
	

	
	public Teacher(String name, double salary, String subject) {
		super(name);
		this.salary = salary;
		this.subject = subject;
		
	}
	
	public double getSalary() {
		return salary;
	}
	public String getSubject() {
		return subject;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
        return "Teacher [Salary=" + salary + ", Subject=" + subject + ", Name="
                + name + "]";
    }
}


class CollegeStudent extends Student{
	int year;
	String major;
	
	public CollegeStudent(String name,String id, int year, String major) {
		super(name,id);
		this.year = year;
		this.major = major;
	}
	
	public int getYear() {
		return year;
		
	}
	
	public String getMajor() {
		return major;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "CollegeStudent [Year=" + year + ", Major=" + major + ", Name="
                + name + "]";
	}
}



public class HighSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher("Hitler",50000.0,"MachineLearning");
		System.out.println(t);
		CollegeStudent c = new CollegeStudent("Rohit","1234567",2018,"ECE");
		System.out.println(c);

	}

}
