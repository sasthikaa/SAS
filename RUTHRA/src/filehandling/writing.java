package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing {
	public static void main(String[] args) throws IOException {
		//file              :  reach the path   : pass file path as input
		//filewriter        : create a file     : pass file object as input
		//bufferedwriter    : write content     : pass filewriter object as input
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\RUTHRA\\src\\filehandling\\t.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hi");
		bw.newLine();
		bw.write("hello");
		bw.newLine();
		bw.write("bye");
		bw.newLine();
		bw.close();
	}

}
