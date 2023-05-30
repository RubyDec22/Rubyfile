package filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

public class FileChecker {
	    public static boolean doesFileExist(String path) {
	        File file = new File("C:\\Users\\hanis\\OneDrive\\Desktop\\Test.txt");
	        try {
	            return file.exists();
	        } catch (Exception e) {
	            // Handle any exceptions that may occur
	            e.printStackTrace();
	            return false;
	        }        
	    }

	    public static void main(String[] args) {
	        String filePath = "C:\\Users\\hanis\\OneDrive\\Desktop\\Test.txt";
	        boolean fileExists = doesFileExist(filePath);
	        if (fileExists) {
	            System.out.println("File exists at path: " + filePath);
	            
	            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	                String line;
	                while ((line = reader.readLine()) != null) {
	                    String[] words = line.split("\\s+");
	                    for (String word : words) {
	                        System.out.println(word);
	                    }
	                }
	            }catch (IOException e) {
	                e.printStackTrace();
	            }
	            

	            
	        } else {
	            System.out.println("File does not exist at path: " + filePath);
	        }
	    }
	}
	