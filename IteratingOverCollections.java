package CollectionFramework;

import java . util .ArrayList; 

import java . util . Iterator;

public class IteratingOverCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>Items=new ArrayList<>();
		
		Items.add("Mango");
		
		Items.add("Banana");
		
		Items.add("Vegatables");
		
		Iterator<String> input=Items.iterator();
		
		while(input.hasNext()) {
			
			System.out.println(input.next());
		}
	}

}
