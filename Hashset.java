package CollectionFramework;
 
import java . util .HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// normal method used without for each loop :
		
		HashSet< Integer> Numbers= new HashSet();
		
		Numbers.add(23);
		
		Numbers.add(25);
		
		Numbers.add(27);
		
		Numbers.add(29); 
		
		 System.out.println (Numbers);
		 
		System.out.println("Total num is :" + Numbers.hashCode());
		
		// for each loop :
		
//		int a=0;
//		
//		for (int numbers : Numbers) {
//			 
//			// normal numbers print :
//			
//			System.out.println(numbers);
// 
//			// addition method :
//			
//			a+=numbers;
//			 
//			System.out.println (a);
//			
//		}
	}

}
