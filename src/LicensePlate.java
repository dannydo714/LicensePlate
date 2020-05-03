/*
 * Danny Do
 * CS141
 * Assignment 4
 * 5/16/18
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LicensePlate {
	public static void main(String []args) throws IOException  {
		askInput();
	}
	
		public static void askInput() throws IOException {
		
		Scanner in = new Scanner(System.in);
		File file = new File("/src/wordsEn.txt");
		Scanner fileScan = new Scanner(file);
		ArrayList<String>dictArray = new ArrayList<String>();
		while(fileScan.hasNextLine()) {
			dictArray.add(fileScan.nextLine());
			
		String userInput = " ";
	do {
		System.out.println("Enter a 3 letter string");
		userInput = in.nextLine().toLowerCase();
		
		if(userInput.toLowerCase().equals("exit")) {
			System.exit(0);
		}
		else {
			if(userInput.length()!=3)
				System.out.println("Enter only 3 letters");
			else { 
				userInput = in.nextLine().toLowerCase();
				char[]lettersArr = new char[3];
				lettersArr[0] = userInput.charAt(0);
				lettersArr[1] = userInput.charAt(1);
				lettersArr[2] = userInput.charAt(2);
			
			for(String s :dictArray) {
				int foundLetters = 0;
				for(int i = 0; i<s.length(); i++) {
					if(foundLetters<=2)
						if(s.charAt(i)== lettersArr[foundLetters])
								foundLetters ++;
			}
				if(foundLetters ==3) {
					System.out.println(s);
				}			
			}
	}
		}
		
	}while(userInput !="exit");
	
	}
		in.close();
		fileScan.close();
}
}
