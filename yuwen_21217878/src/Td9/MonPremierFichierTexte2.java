package Td9;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class MonPremierFichierTexte2 {
	
	public static void main(String[] args) {

		try {
			PrintWriter pr = new PrintWriter(
					new File("/Users/semmiehu/Desktop/sorbonne/jeudi/Nom.txt"));
			pr.println("Carine Hu");
			pr.println("Jean Pierre");
			pr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(Verifier());

	}

	public static boolean Verifier() {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(new File("/Users/semmiehu/Desktop/sorbonne/jeudi/Nom.txt")));
			if (br.readLine().equals("Carine Hu") == false)
				return false;
			if (br.readLine().equals("Jean Pierre") == false)
				return false;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
		
	}

}
	


