package odev2;

public class InstructorManager {
	
	
	public void add(Instructor instructor) {
		
		System.out.println(instructor.id+ "/ " + instructor.firstName + "/ " + instructor.lastName + " /" + instructor.email + "/ " + instructor.password + " /" + "E�itmen kayd� olu�turuldu.");
	}
	
	public void delete(Instructor instructor) {
		
		System.out.println(instructor.id + " /" + "E�itmen kayd� silindi. ");
		
	}
	
	public void update(Instructor instructor) {
		
		System.out.println(instructor.id + " /" + "E�itmen kayd� g�ncellendi.");
	}

}
