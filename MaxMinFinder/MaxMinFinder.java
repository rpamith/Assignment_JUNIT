package MaxMinFinder;

import java.util.Arrays;

public class MaxMinFinder {
	
	public int[] findMinMax(int[] a) {
		int max=0,min=0;
		int[] arr = new int[] {56,34,7,3,54,3,34,34,53};
		Arrays.sort(a);
		
		arr[0] = a[0];
		arr[8] = a[a.length-1];
		
		return arr;
		   }

	public static void main(String[] args) {
		
		MaxMinFinder obj = new MaxMinFinder();
        
        int[] a =  obj.findMinMax(new int[] {56,34,7,3,54,3,34,34,53});
        
        System.out.println(a[0]);
        System.out.println(a[8]);
		

	}

}
