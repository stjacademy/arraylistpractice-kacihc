import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		
		ArrayList <Integer> myList = new ArrayList  <Integer>();
		
		myList.add(42);
		myList.add(25);
		myList.add(315);
		
		//myList.remove(1);
		//myList.get(1);
		//myList.set(1, 50);
		//myList.add(1, 50);
		
		for(int i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		for(Integer num : myList) {
			System.out.println(num);
			

		}
		
	}

}
