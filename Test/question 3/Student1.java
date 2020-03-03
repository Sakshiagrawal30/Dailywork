package day28;

public class Student1 {

		String name;
		int marks;
		public Student1(){
		}
		public Student1(String name, int marks) {
			super();
			this.name = name;
			this.marks = marks;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		@Override
	public String toString() {
			return "Student1 [name=" + name + ", marks=" + marks + "]";
	}
	}

