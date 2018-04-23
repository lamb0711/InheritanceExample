package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person{
	int facultyNumber;
	
	public Faculty()    {
		super();        
		facultyNumber = 0;//Indicating no number yet    
	}
	
	public Faculty(String initialName, int initialStudentNumber){
		super(initialName);        
		facultyNumber = initialStudentNumber;    
	}
	
    void reset(String newName, int newFacultyNumber) {
    	setName(newName);        
    	facultyNumber = newFacultyNumber;
    }
    
    int getFacultyNumber() {
    	return facultyNumber;
    }
    
    void setFacultyNumber(int newFacultyNumber) {
    	facultyNumber = newFacultyNumber;
    }
    
    public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + facultyNumber); 
	}
    
    boolean equals(Faculty otherFaculty) {
    	return this.hasSameName(otherFaculty) && (this.facultyNumber == otherFaculty.facultyNumber);
    }

}
