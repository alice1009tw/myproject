package oo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleWrite {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("data.txt");
			fos.write(98);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		
	}

}
