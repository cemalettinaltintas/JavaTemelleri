package arrayDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		
		Set<String> names=new TreeSet<>();
		names.add("yakup");
		names.add("ali");
		names.add("ali");
		names.add("ahmet");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println(names.size());
	}
}
