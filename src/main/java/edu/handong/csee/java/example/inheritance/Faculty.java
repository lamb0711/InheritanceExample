package edu.handong.csee.java.example.inheritance;

public class Faculty {
	int facultyNumber;
	
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
    
    boolean equals(Faculty otherFaculty) {
    	return this.hasSameName(otherFaculty) && (this.facultyNumber == otherFaculty.facultyNumber);
    }

}
