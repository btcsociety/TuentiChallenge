package kikebodi;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;


public class Corrector {
		//Author: Kike Bodí
		//www.kikebodi.com
		public static void main(String args[]){
			try{
				BufferedReader fkeyb = new BufferedReader(new InputStreamReader(System.in));
				//Open dictionary file //PROBLEM WITH PATH
				List<String> words = getDictionaryWords(getKeybLine(fkeyb));				
				//import data to array
				String word;
				int cases = Integer.parseInt(getKeybLine(fkeyb));
				for(int i=0;i<cases;i++){
					System.out.println(correctWord(getKeybLine(fkeyb),words));				
				}
		    	}catch (Exception e){//Catch exception if any
		   			System.err.println("Error: " + e.getMessage());
		    	}
			}

		private static String correctWord(String keybLine, List<String> words ) {
			//ALFABETICAL ORDER
			Iterator<String> iter = words.iterator();
			String ret = keybLine+" ->", aux;
			//if(!words.contains(keybLine))
			while (iter.hasNext()){
				aux = iter.next();
				if(getNum(keybLine) == getNum(aux) && keybLine.compareTo(aux) != 0)
					ret += " "+aux;					
				}
				
			return ret;
		}

		private static int getNum(String word) {
			int e = 0;
			for(int i=0;i<word.length();i++)
				e += word.charAt(i);
			return e;
		}

		private static List<String> getDictionaryWords(String keybLine) throws IOException {
			FileInputStream fstream = new FileInputStream(keybLine);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader ffile = new BufferedReader(new InputStreamReader(in));
			List<String> words = new ArrayList<String>();
			String line;			
			do{
	            line = ffile.readLine();
	            if  (line != null && !line.trim().equals("")){
	                words.add(line);
	            }
	        } while(line != null);
			return words;
		}

		private static String getKeybLine(BufferedReader fkeyb) throws IOException {
			String line = fkeyb.readLine();
			while(line.charAt(0) == '#')
				line = fkeyb.readLine();
			return line;
		}
}
