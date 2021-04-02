//Written by Adara Blichfeldt

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author Adara
 *
 */

public class Module2SDLC {
	
	/**
	 * 
	 * @param args
	 * 
	 */
	
	public int countall(String word){
		/**
		 * Method used for the tests, counts each instance of that letter.
		 */
    	int count = 0;
    	for(int i = 0; i < word.length(); i++) {
    		if(word.charAt(i)=='t' || word.charAt(i)=='T') {
    			count++;
    		}
    	}
    	return count;
    }

	public static void main(String[] args) throws Exception {
		/**
		 * Main method. Opens the file in read mode, 
		 * gets each line till end of file is reached.
		 * Splits each line into words and counts each word.
		 * @see Exception
		 * @throws Exception
		 */
		        String line;  
		        int count = 0;  
		          
		        HashMap<String, Integer> map = new HashMap<>();
		        
		          
		        FileReader file = new FileReader("Raven.txt");  
		        BufferedReader br = new BufferedReader(file);  
		              
		          
		        while((line = br.readLine()) != null) {  
		             
		            String words[] = line.split(" ");  
		            
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
		        
		        
		        
		       System.out.println("Number of words present in given file: " + count);  
		        
		        
		        
		        br.close();  

	}

}