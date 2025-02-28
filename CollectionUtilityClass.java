package CollectionFramework;

import java . util .ArrayList;

import java . util . Collections;

public class CollectionUtilityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>Nums=new ArrayList<>();
		
		Nums.add(3);
		
		Nums.add(4);
		
		Nums.add(7);
		
		Collections.sort(Nums);
		
		System.out.println("Sorted List :"+ Nums);
		
		Collections.reverse(Nums);
		
		System.out.println("Reverse :" + Nums);
		
		Collections.shuffle(Nums);
		
		System.out.println("Shuffle :" + Nums);
	}

}

		
	