package com.fow;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FowService {

	static String printFrequency(String input)
	{
		String outPut="";
		char startingChar='a';
	    Map<String, Integer> words = new LinkedHashMap<String,Integer>();
	    if(input.contains("\n")) {
	    	String wrds[] = input.split("\n");
	    	for (int x=0;x<wrds.length;x++) {
	    		wrds[x]=wrds[x].replaceAll("\\s","");
	    	}
	    	  for (String wrd : wrds) {
	  	    	if(wrd.charAt(0) == startingChar ) {
	              if (words.containsKey(wrd)) {
	                  words.put(wrd, 1 + words.get(wrd));
	              } else {
	                  words.put(wrd, 1);
	              }
	  	    	}
	          }
	    }else {
	    String wrds[] = input.split(" ");
	    for (String wrd : wrds) {
	    	if(wrd.charAt(0) == startingChar ) {
            if (words.containsKey(wrd)) {
                words.put(wrd, 1 + words.get(wrd));
            } else {
                words.put(wrd, 1);
            }
	    	}
        }
	    }
	  
	    Set<String> keySet = words.keySet();
	    for (String strig : keySet) {
	    	outPut= outPut+"\n"+strig +"  "+words.get(strig);
	    	
		}

        return outPut;
	}
	 
	    

}
