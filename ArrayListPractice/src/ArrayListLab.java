import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLab {

	public static Scanner scan = new Scanner(System.in);

	public static void main (String[]args) {

		ArrayList a = getListOfFactors(36);
		System.out.println(a);


		composite(a);

	}

	public static ArrayList<Integer> getListOfFactors(int number){

		ArrayList<Integer>factors = new ArrayList<Integer>();

		for(int i=2; i<number; i++) {
			if(number%i==0) {
				factors.add(i);
			}
		}

		return factors;                                                                        
	}

	public static void composite( ArrayList<Integer> factors ) {

		for(int i=0; i<factors.size(); i++) {

			for(int j=0; j<Math.sqrt(i); j++) {

				if(factors.get(j)%j == 0) {
					factors.remove(factors.get(i)); 
					i--;
				}

			}
		}
		System.out.println(factors);
	}

}

