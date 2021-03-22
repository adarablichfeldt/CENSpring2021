package testspackage;
//Written by Adara Blichfeldt

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Module2SDLC2 {

	public int countA(String word){
    	int countA = 0;
    	for(int i = 0; i < word.length(); i++) {
    		if(word.charAt(i)=='a' || word.charAt(i)=='A') {
    			countA++;
    		}
    	}
    	return countA;
    }
	
	public int countT(String word){
    	int countT = 0;
    	for(int i = 0; i < word.length(); i++) {
    		if(word.charAt(i)=='t' || word.charAt(i)=='T') {
    			countT++;
    		}
    	}
    	return countT;
    }
	
	public int countI(String word){
    	int countI = 0;
    	for(int i = 0; i < word.length(); i++) {
    		if(word.charAt(i)=='I' || word.charAt(i)=='i') {
    			countI++;
    		}
    	}
    	return countI;
    }
	
	public int countN(String word){
    	int countN = 0;
    	for(int i = 0; i < word.length(); i++) {
    		if(word.charAt(i)=='N' || word.charAt(i)=='n') {
    			countN++;
    		}
    	}
    	return countN;
    }
	
	public int countO(String word){
    	int countO = 0;
    	for(int i = 0; i < word.length(); i++) {
    		if(word.charAt(i)=='O' || word.charAt(i)=='o') {
    			countO++;
    		}
    	}
    	return countO;
    }
	
	public static void main(String[] args) throws Exception {
		        String line;  
		        int count = 0;  
		          
		        HashMap<String, Integer> map = new HashMap<>();
		        
		        //Opens a file in read mode  
		        FileReader file = new FileReader("Raven.txt");  
		        BufferedReader br = new BufferedReader(file);  
		              
		        //Gets each line till end of file is reached  
		        while((line = br.readLine()) != null) {  
		            //Splits each line into words  
		            String words[] = line.split(" ");  
		            //Counts each word  
		            count = count + words.length; 
		            
		            for (String w : words) {
		                Integer n = map.get(w);
		                n = (n == null) ? 1 : ++n;
		                map.put(w, n);
		                //Collection<Integer> values = w.values();
		               // Collections.sort(n, );
		               
		                //Collections.reverseOrder()
		                
		                //Collections.sort(map);
		                
		                for (int i = 0; i < 1; i++) {
			                System.out.println(w + ": " + n);
			                }
		                
		            }
		            
		        }
		        
		        
		        
		       // System.out.println("Number of words present in given file: " + count);  
		        
		        
		        
		        br.close();  

	}

}