package day3HomeWork;

public class Main {


	public static void main(String[] args) {
		User user = new User(5,"Halil ", " D�nmez ", " 123456");
		Student student = new Student(7,"Alihan ","Demirda� ", " 45632 ");
		Instructor instructor = new Instructor(5,"Kerem ", "Var�� ", " 56489 ","\tYaz�l�m Geli�tirici Yeti�tirme C++");
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		System.out.println("\t-------Added---------");
		userManager.add(user);
		studentManager.add(student);
		instructorManager.add(instructor);
		
		
		
		System.out.println("\n\n\t---------Deleted---------");
		userManager.delete(user);
		studentManager.delete(student);
		instructorManager.delete(instructor);
		
		User[] users = {};
		
		
	}

}
