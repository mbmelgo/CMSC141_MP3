package cellular_automata;

import java.util.Scanner;
import java.*;

public class Cellular_Automata{

	public static void main(String[] args) {
		int width = 0;
		int iterations = 0;
		String choice = " ";
		Scanner scanner = new Scanner(System.in);

		while(choice.equals(" ")){
			System.out.println("Enter the width:");
			choice = scanner.nextLine();
			try{
				width = Integer.parseInt(choice);
			}
			catch(java.lang.NumberFormatException e){
				System.out.println("Please enter a valid input!");
				choice = " ";
				continue;
			}
		}
		choice = " ";
		while(choice.equals(" ")){
			System.out.println("Enter the number of iterations:");
			choice = scanner.nextLine();
			try{
				iterations = Integer.parseInt(choice);
			}
			catch(java.lang.NumberFormatException e){
				System.out.println("Please enter a valid input!");
				choice = " ";
				continue;
			}
		}

		Rule_30 rule_30 = new Rule_30(width,iterations);
		rule_30.print();

	}


}

