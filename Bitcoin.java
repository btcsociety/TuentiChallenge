package kikebodi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bitcoin {
	//Author: Kike Bodí
	//www.kikebodi.com
	public static void main(String args[]){
		try{
			//Open the file and get reader
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//nº of cases
			int cases = Integer.parseInt(br.readLine());
			//initial budget
			int budget;
			//import data to array
			StringTokenizer st;
			for(int i=0;i<cases;i++){
				budget = Integer.parseInt(br.readLine());
				st = new StringTokenizer(br.readLine());
				int values[] = new int[st.countTokens()];
				for(int e=0;st.hasMoreTokens();e++)
					values[e] = Integer.parseInt(st.nextToken());
				int finalValue = portfolioOptimizer(budget,values);
				System.out.println(finalValue);
			}
	    	}catch (Exception e){//Catch exception if any
	   			System.err.println("Error: " + e.getMessage());
	    	}
		}

	private static int portfolioOptimizer(int budget, int[] values) {
		int shares = 0;
		for(int i=0;i<values.length-1;i++){
			
			if(shares == 0 && values[i]<values[i+1]){			
				shares = budget/values[i];
				budget = 0;
			}
			else if(shares != 0 && values[i]>values[i+1]){
				budget = shares*values[i];
				shares = 0;
			}
		}
		budget = budget+shares*values[values.length-1];
		return budget;
	}
}
