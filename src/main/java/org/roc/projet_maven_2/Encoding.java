package org.roc.projet_maven_2;

import java.util.Base64;
import java.io.*;

public class Encoding {
	
	public static void main(String[] args) {

	    File f =  new File("D:/Axel/Documents/Mines Saint-Etienne/tOOLBOX3/imageBase64.jpg");
	      String encodstring = encodeFileToBase64Binary(f);
	      System.out.println(encodstring);
	}
	
	private static String encodeFileToBase64Binary(File file){
	     String encodedfile = null;
	     try {
	         FileInputStream fileInputStreamReader = new FileInputStream(file);
	         byte[] bytes = new byte[(int)file.length()];
	         fileInputStreamReader.read(bytes);
	         encodedfile = Base64.getEncoder().encode(bytes).toString();
	     } catch (FileNotFoundException e) {
	         e.printStackTrace();
	     } catch (IOException e) {
	         e.printStackTrace();
	     }
	    
	     return encodedfile;
	 }
}

