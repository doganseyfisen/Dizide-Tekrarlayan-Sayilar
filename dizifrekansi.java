import java.util.*;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int[] arr = {10, 8, 56, 56, 21, 10, 10, 10};
		
        //freq dizisi elemanların frekansını saklaycak 
        int [] freq = new int [arr.length];  
        int visited = -1;  
        
        for(int i = 0; i < arr.length; i++){  
            int counter = 1;  //sayaç
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                	counter++;  
                    //Aynı elemanı tekrar saymayı önlemek için 
                    freq[j] = visited;  
                }  
            }  
            if(freq[i] != visited)  
            	freq[i] = counter;  
        }  
        
        //Her elemanın dizideki frekansını gösterir
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != visited)  
                System.out.println(arr[i] + " sayısı " + freq[i] + " defa tekrar ediyor." );  
        }    
    }  
}
