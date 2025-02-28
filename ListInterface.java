package CollectionFramework;

import java.util.ArrayList;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Name = new ArrayList<>();
		
		Name.add("Nawaz ,");
		
		Name.add("Zubair ,");
		
		Name.add("Aniq ");
		
        System.out.println("Total Name is : " + Name.get(0) + Name.get(1) + Name.get(2));
		
	    Name.remove(0); 
	    
	    Name.remove(1);
	    
	    System.out.println("Total names size is :" + Name.size());

	}
	
	}
		
		


