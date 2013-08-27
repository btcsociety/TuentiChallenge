package kikebodi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lost {
		//Author: Kike Bodí
		//www.kikebodi.com
		public static void main(String args[]){
			try{
				//Get keyboard reader
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				//nº of cases
				int cases = Integer.parseInt(br.readLine());
				//import data
				String phrase;
				for(int i=0;i<cases;i++){
					phrase = br.readLine();
					System.out.println(chronologicalOrder(phrase));
				}
		    	}catch (Exception e){//Catch exception if any
		   			System.err.println("Error: " + e.getMessage());
		    	}
			}

	private static String chronologicalOrder(String phrase) {
		String delims = ".<>", aux;
		StringTokenizer tokens = new StringTokenizer(phrase, delims);
		int num = tokens.countTokens();
		int index = 0, indexAnt = 0, order = 1;
		int a,b,c;
		//System.out.println("Number of tokens: "+num);
		String ordered[] = new String[num];
		if(phrase.charAt(0) != '.') return "invalid";
		/*while(index<phrase.length()){
			int position = 0;
			indexAnt = index;
			a = phrase.indexOf('.', index+1);
			if(a ==-1) a = 2147483647;
			b = phrase.indexOf('<', index+1);
			if(b ==-1) b = 2147483647;
			c = phrase.indexOf('>', index+1);
			if(c ==-1) c = 2147483647;
			index = Math.min((Math.min(a, b)),c);
			System.out.println("Index: "+index);
			if(index>=2147483647) break;
			System.out.println("ini: "+indexAnt+" fin: "+index);
			aux = phrase.substring(indexAnt+1, index);
			System.out.println("aux: "+aux);
			
			if(indexAnt == '.') {order++; position = order;}
			else if(indexAnt == '<') position = order-1;
			else if(indexAnt == '>') position = order+1;
			
			ordered[position] = aux;
			for(int i=0;i<ordered.length;i++)
				System.out.print(ordered[i]+" ");
		}*/
		while()
		
		return null;
	}
}
