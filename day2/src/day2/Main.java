package day2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Course course1 = new Course(5,"Engin Demrio�\t","Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java-React)",100);
		
		Course course2 = new Course(9,"Engin Demrio�\t","Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C#-Angular)",24);
		
		Course[] courses = {course1,course2};
		
		for(Course course:courses) {
			System.out.println(course.instructor+course.title+course.completed+"\n");

		}
		
		CourseManager courseManager =new CourseManager();
		System.out.println("\n\t\t\tKurslar\n");
		courseManager.display(course1);
		courseManager.display(course2);
		
		System.out.println();

	}

}
