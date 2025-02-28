package CollectionFramework;

import java . util .HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// direct method :
		
		HashMap<String , Integer> ages = new HashMap<>();	
		
		ages.put("Shoaib " , 21);
		
		ages.put("Ali ", 24);
		
		ages.put("Affan ", 25);
		
		System.out .println("Shoaib age is : " + ages.get("Shoaib "));
		

		System.out .println("Ali Age is : " + ages.get("Ali "));
		

		System.out .println("Affan Age is : " + ages.get("Affan "));
		
		// remove method :
		
		ages.remove("Shoaib ");
		
		System.out.println(ages);
		
		// if condition :
		
		if(ages.containsKey("Ali ")) {
			
			System.out.println("Ali is present :");
		}
		
		// than second two name is print :
		
		{
		
			System.out.println("Keys :" + ages.keySet());
		
		}
		
	}

}
