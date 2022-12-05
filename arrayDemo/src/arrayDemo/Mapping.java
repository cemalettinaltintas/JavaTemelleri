package arrayDemo;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) {		
		Map<String,String> userMap=new HashMap<>();
		userMap.put("email", "cemalettinaltintas@gmail.com");
		userMap.put("name", "Cemalettin");
		userMap.put("address", "İstanbul");
		userMap.put("mobile", "053545656");
		
		System.out.println("Telefon : "+ userMap.get("mobile"));
		
		for (Map.Entry<String, String> pairs:userMap.entrySet()) {
			System.out.println(pairs.getValue());
		}
	}
}