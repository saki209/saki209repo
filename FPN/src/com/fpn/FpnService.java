package com.fpn;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FpnService {

	public static String getPrime(String input) {

		String outPut="";
	    Map<Integer, Integer> words = new LinkedHashMap<Integer,Integer>();
	    if(input.contains("\n")) {
	    	String wrds[] = input.split("\n");
	    	int size = wrds.length;
	        int [] arr = new int [size];
	    	for (int x=0;x<wrds.length;x++) {
	    		wrds[x]=wrds[x].replaceAll("\\s","");
	    		arr[x] = Integer.parseInt(wrds[x]);
	    	}
	    	  for (int i=0; i<arr.length; i++) {
	    		  boolean isPrime = true;
	    	        if (arr[i] == 1)
	    	            isPrime = false;
	    	        else {
	    	            // check to see if the numbers are prime
	    	            for (int j = 2; j <= arr[i] / 2; j++) {
	    	                if (arr[i] % j == 0) {
	    	                    isPrime = false;
	    	                    break;
	    	                }
	    	            }
	    	        }
	    	        if (isPrime){
	    	            if (arr[i] == 0){}
	    	            else {
	    	                System.out.print(arr[i] + " , ");
	    	                if (words.containsKey(arr[i])) {
	    		                  words.put(arr[i], 0);
	    	            }else {
			    	    	 words.put(arr[i], 0);
			    	    }
	    	    }
	  	    	
	          }
	    	        else {
		    	    	 words.put(arr[i], 1);
		    	    }
	    }	  
	    Set<Integer> keySet = words.keySet();
	    for (Integer strig : keySet) {
	    	outPut= outPut+"\n"+strig +"  "+words.get(strig);
	    	
		}
		
	}
	    return outPut;
	}

}
