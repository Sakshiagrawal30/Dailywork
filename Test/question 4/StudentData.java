package day28;



	import java.util.ArrayList;

	public class StudentData {
		 ArrayList<Student> addData(){


			   Student s1=new Student();
			   s1.name="Harshita";
			   s1.phyMarks=95;
			   s1.mathsMarks=100;
			   s1.chemMarks=90;
			   s1.total=95+100+90;
			   s1.per=((s1.total)*100)/300;

			   Student s2=new Student();
			    s2.name="Sakshi";
			    s2.phyMarks=80;
			    s2.mathsMarks=85;
			    s2.chemMarks=90;
			    s2.total=80+85+90;
			    s2.per=((s2.total)*100)/300;


			   ArrayList<Student> al=new ArrayList<Student>();


			         al.add(s1);
			         al.add(s2);
			         return al;

			  }
	}

