package duplicateCharInString;

import java.util.HashMap;
import java.util.Map;

public class DupliacteCharInStrings {
	

	public static void main(String[] args) {
		
		
		getCharCount("Hash table based implementation of the Map interface. "
				+ "This implementation provides all of the optional map operations, "
				+ "and permits null values and the ");

		
	}
	public static void getCharCount(String Name) {
		 
	      
	      Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
	      char string[] = Name.toCharArray();
	      for (Character c : Name.toCharArray()) {

	          if (hashMap.containsKey(c)) {
	              int val  = hashMap.get(c);
	              hashMap.put(c, val + 1);
	          }
	          else {
	              hashMap.put(c, 1);
	          }
	              
	          } System.out.println(hashMap);
	      }
	     
	    }
		
	


