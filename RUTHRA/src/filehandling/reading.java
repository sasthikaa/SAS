package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import inheritance.parent;

public class reading {

	public static void main(String[] args) throws IOException {
		
		// File            : reach the path    : path of the file as input
		//FileReader       : fetch that file   : file object as input
		//BufferedReader   : read content      : filereader as input
		
		//parent.ps();
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\RUTHRA\\src\\filehandling\\t.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		/*first  br.readline reads first line   line=hi    line!=null   print hi
		 *second br.readline reads secondline   line=hello line!=null   print hello
		 *third  br.readline reads third line   line=bye   line!=null   print bye
		 *fourth br.readline reads nothing   line=null     null!=null  // loop terminate
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
	}
}
