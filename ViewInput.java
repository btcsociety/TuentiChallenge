package kikebodi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ViewInput {
	static BufferedWriter out;
	public static void main(String args[]) throws IOException{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// Create file 
			FileWriter file = new FileWriter("output.txt");
			out = new BufferedWriter(file);
			
			String line = "algo";
			while(line != null){
				line = br.readLine();
				System.out.println(line+"\n");
				out.write(line+"\n");			
			}					
			out.close();
	    	}catch (Exception e){//Catch exception if any
	    		
				out.close();
	   			System.err.println("Error: " + e.getMessage());
	    	}
		}
}
