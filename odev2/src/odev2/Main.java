package odev2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroğ";
		instructor.email = "engin@gmail.com";
		instructor.password = "12345";
		
		Student student = new Student();
		student.id = 2;
		student.firstName = "Ayşenur";
		student.lastName = "Akın";
		student.email = "ayse@gmail.com";
		student.password = "78910";
		
		UserManager userManager = new UserManager();
		User[] user = {instructor, student};
		userManager.addMultiple(user);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.delete(instructor);
		


		
	

	}

}
