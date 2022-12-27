import java.util.*;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	static boolean isFind(int[] list, int value) {
		for(int x : list) {
			if(x == value) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 6, 1, 1, 1, 13, 6, 2, 6, 4, 9, 9, 3, 4, 2, 8};
		int dupli[] = new int[arr.length];
		int startInd = 0;
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr.length; y++) {
				if((arr[x] % 2 == 0))
				if((x != y) && (arr[x] == arr[y])) {
					if(!isFind(dupli, arr[x])) {
						dupli[startInd++] = arr[x];
					}
					break;
				}
			}
		}
		for (int value : dupli) {
			if(value != 0) {
				System.out.println(value);
			}
		}
	}
}
