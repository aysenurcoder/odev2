package odev2;

public class StudentManager {
	
	public void add(Student student) {
		
		System.out.println(student.id + " /" + student.firstName + " /" + student.lastName + " /" + student.email + "/ " + student.password  + " /" + " ��renci kayd� olu�turuldu.");
	}
	
    public void delete(Student student) {
		
		System.out.println(student.id + "/ " + student.firstName + " /" + student.lastName + "/ " + " ��renci kayd� silindi.");
	}
    
public void update(Student student) {
		
		System.out.println(student.id + " /" + student.firstName + "/ " + student.lastName + "/ " + " ��renci kayd� g�ncellendi.");
	}

}
