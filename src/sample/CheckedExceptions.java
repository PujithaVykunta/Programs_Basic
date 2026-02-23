package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptions {
public static void main(String[] args)  {
	
	File f=new File("C:\\Users\\Pujitha Vykunta\\OneDrive\\Desktop\\filesjava\\checkedException.txt");
	FileWriter fw = null;
	try {
	f.createNewFile();
	 fw=new FileWriter(f);
	fw.write("something happend");
	fw.flush();
	System.out.println("written in the file");
	}
	catch(IOException e) {
		System.out.println("exception handled here");
	}
	finally {
		if(fw!=null) {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
}
