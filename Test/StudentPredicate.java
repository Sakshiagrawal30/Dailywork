package day28;


	import java.util.Arrays;
	import java.util.List;
	import java.util.function.Predicate;
	import java.util.stream.Collectors;
	public class StudentPredicate {


			public static Predicate<Student1> isMarksAboveEqual80() {
					return student -> student.getMarks() >= 80;
				}
				public static Predicate<Student1> isMarksFirstClass() {
					return student -> student.getMarks() >= 60 && student.getMarks() <=79;
				}
		public static Predicate<Student1> isMarksFail() {
					return student -> student.getMarks() < 50;
		}
		public static List<Student1> filterStudent(List<Student1> students, Predicate<Student1> predicate) {
			return students.stream().filter(predicate).collect(Collectors.toList());
		}
		public static void main(String[] args) {
			List<Student1> students = Arrays.asList( new Student1("Harshita", 80), new Student1("Shreya", 50),
			new Student1("Divya", 90), new Student1("Mehul", 60),  new Student1("Gagan", 30),new Student1("Shakti", 40));
			System.out.println("Distinction : ");
			StudentPredicate.filterStudent(students, StudentPredicate.isMarksAboveEqual80()).forEach(System.out::println);
			System.out.println("First Class: ");
			StudentPredicate.filterStudent(students, StudentPredicate.isMarksFirstClass()).forEach(System.out::println);
			System.out.println("Fail: ");
			StudentPredicate.filterStudent(students, StudentPredicate.isMarksFail()).forEach(System.out::println);
		}
		}

