package CollectionFramework;

import java . util . LinkedList;

import java . util . Queue;

public class QueueInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String>tasks=new LinkedList<>();

		tasks.offer("My Name :");
		
		tasks.offer("Is :");
		
		tasks.offer("Shoaib :");
		
		while(!tasks.isEmpty()) {
			
			System.out.println("Processing :" + tasks.poll());
			
		}
	}

}
