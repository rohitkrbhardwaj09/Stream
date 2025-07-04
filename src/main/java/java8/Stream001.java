package java8;

import java.util.ArrayList;
import java.util.List;

public class Stream001 {

	public static void main(String[] args) {
		
		List<String> names  = new ArrayList<String>();

		names.add("Aman");
		names.add("Prashant");
		names.add("Raman");
		names.add("Rahul");
		names.add("Rohit");
		names.add("Ryan");
		names.add("Abhi");
		names.add("Arman");
		
		// traditional way to iterate
		// using forEach loop
		// print all those name which first letter is R
		// external way
		for (String name : names) {
			if(name.startsWith("R") && name.length()>4) {
				System.out.println(name);
			}
		}
		
		System.out.println("-----------------------------");
		
		// using java8 : stream 
		names.stream().filter(name->name.startsWith("R")).filter(name->name.length()>4).sorted().forEach(System.out::println);
		
		
	}

}
