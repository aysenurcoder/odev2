package odev2;

public class StudentManager {
	
	public void add(Student student) {
		
		System.out.println(student.id + " /" + student.firstName + " /" + student.lastName + " /" + student.email + "/ " + student.password  + " /" + " Öğrenci kaydı oluşturuldu.");
	}
	
    public void delete(Student student) {
		
		System.out.println(student.id + "/ " + student.firstName + " /" + student.lastName + "/ " + " Öğrenci kaydı silindi.");
	}
    
public void update(Student student) {
		
		System.out.println(student.id + " /" + student.firstName + "/ " + student.lastName + "/ " + " Öğrenci kaydı güncellendi.");
	}

}
