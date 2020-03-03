package day28;


	import java.util.ArrayList;

	public class RetrieveStudents
	{
		public static void main(String[] args) {
			fetchStudentData();

		}



	    static void fetchStudentData(){


	        StudentData stdata=new StudentData();


	       ArrayList<Student> liststu=stdata.addData();


	          for(Student student:liststu)
	          {
	            System.out.println("Name: " +student.name);
	            System.out.println("Physics Marks: " +student.phyMarks);
	            System.out.println("Maths Marks: " +student.mathsMarks);
	            System.out.println("Chemistry Marks: " +student.chemMarks);
	            System.out.println("Total Marks: " +student.total);
	            System.out.println("Percentage:" +student.per);
	          }


	}

	}

