package odev2;

public class InstructorManager {
	
	
	public void add(Instructor instructor) {
		
		System.out.println(instructor.id+ "/ " + instructor.firstName + "/ " + instructor.lastName + " /" + instructor.email + "/ " + instructor.password + " /" + "Eðitmen kaydý oluþturuldu.");
	}
	
	public void delete(Instructor instructor) {
		
		System.out.println(instructor.id + " /" + "Eðitmen kaydý silindi. ");
		
	}
	
	public void update(Instructor instructor) {
		
		System.out.println(instructor.id + " /" + "Eðitmen kaydý güncellendi.");
	}

}
