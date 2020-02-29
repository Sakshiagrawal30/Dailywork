package Day27th;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.NameList;

public class StreamAPI {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		addNames(names);
		System.out.println(names);

		// 1.print names of length more than 6

		List<String> nameList = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		System.out.println("length more than 6");
		nameList.forEach(System.out::println);

		// 2. names in uppercase

		List<String> namesinupper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("names in uppercase");
		namesinupper.forEach(System.out::println);
		
		long count=names.stream().count();
		System.out.println("list count is="+count);
		Stream<Integer> data=Stream.of(1,11,111,1111);
		System.out.println("data count:"+data.count());
		
		
		Stream<String> languages=Stream.of("java","python","c","c++","angular");
		//Stream<String> langLength=languages.filter(s -> s.length() >4);
		//List<String>  langLength=languages.filter(s -> s.length()>4).collect(Collectors.toList());
		
		//langLength.forEach(System.out::println);
		List<String> langadd=languages.map(s -> s.concat(" programming")).collect(Collectors.toList());
		langadd.forEach(System.out::println);
		
	//3.sort list	
		List<String> defaultsorted=names.stream().sorted().collect(Collectors.toList());
System.out.println("....default sorting....");
defaultsorted.forEach(System.out::println);

List<String> customsorting=names.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
System.out.println(".....descending order sorting...");
	customsorting.forEach(System.out::println);
	}

	private static void addNames(ArrayList<String> names) {
		names.add("sakshi");
		names.add("harshita");
		names.add("disha");
		names.add("muskan");
		names.add("sri");

	}
}
