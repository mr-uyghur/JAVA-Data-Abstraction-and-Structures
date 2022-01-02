
//ADT is a collection of data
//and a set of operations(actions) on that data

public class Student {
	//collection of data
	//a class has private fields and public methods
	//private fields are for the data in our ADT
	//public methods are for operations
	private String name;
	private int id;
	private double gpa;
	
	//set of action of that data
	//public methods that allows users to interact with these data
	
	/** Access Methods - these methods accesses the current state,but do not alter the state. */
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	/** Mutator Methods - these methods are used for altering the state, but do not access */
	//we don't need to 'return' anything because we are not accessing the data,
	//we're only altering it.
	public void setName(String newName) {
		name = newName;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void setGpa(double newGpa) {
		gpa = newGpa;
	}
	
	/** Constructors - a constructor creates new instance of their class
	 * A good constructor defines initial(default) values to all fields of the class
	 * Make sure each of the private fields gets assign an initial value 
	 * in the constructor
	 */
	public Student() { //default constructor
		name = "";
		id = 0;
		gpa = 0.0;
	}
	
	public Student(String s_name, int s_id, double s_gpa) {
		name = s_name;
		id = s_id;
		gpa = s_gpa;
	}
	
	/** Additional operations */
	//a method that display a student
	
	public String toString() {
		return "Student: " + name + "\nID: " + id + "\nGPA: " + gpa;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		
		Student s2 = new Student("John", 007, 3.68);
		System.out.println(s2);
		
	}

}
