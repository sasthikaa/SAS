package exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class thrwss {

	public static void main(String[] args) throws FileNotFoundException  {
		
		File f=new File("C:\\Users\\hp\\eclipse-workspace\\NINEAM\\src\\filehandling\\dk.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
	}
}
