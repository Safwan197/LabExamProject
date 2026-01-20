package MainProgram;

public class MainProgram {


	    // ----------- SIMPLE STUDENT CLASS (INSIDE SAME FILE) -----------
	    static class Student {
	        int id;
	        String name;
	        float cgpa;

	        Student(int id, String name, float cgpa) {
	            this.id = id;
	            this.name = name;
	            this.cgpa = cgpa;
	        }
	    }

	    // ------------------------ MAIN METHOD ---------------------------
	    public static void main(String[] args) {

	        // Creating student objects
	        Student s1 = new Student(1, "Ali", 3.1f);
	        Student s2 = new Student(2, "Safwan", 3.8f);
	        Student s3 = new Student(3, "Azan", 3.4f);
	        Student s4 = new Student(4, "Tariq", 3.2f);

	        // Store in array
	        Student[] list = {s1, s2, s3, s4};

	        // Print all students
	        System.out.println("All Students:");
	        for (Student s : list) {
	            System.out.println(s.id + "  " + s.name + "  CGPA: " + s.cgpa);
	        }

	        // Find student with highest CGPA
	        Student top = list[0];
	        for (Student s : list) {
	            if (s.cgpa > top.cgpa) {
	                top = s;
	            }
	        }

	        System.out.println("\nTop Student:");
	        System.out.println(top.id + "  " + top.name + "  CGPA: " + top.cgpa);
	    }
	}


