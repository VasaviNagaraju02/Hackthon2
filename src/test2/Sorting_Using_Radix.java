package test2;



	import java.util.Arrays;
	public class Sorting_Using_Radix {
	    public static void sort(int[] array) {
	        Sorting_Using_Radix.sort(array, 10);
	    }

	 

	    public static void sort(int[] array, int radix) {
	        if (array.length == 0) {
	            return;
	        }

	 

	        
	        int minValue = array[0];
	        int maxValue = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < minValue) {
	                minValue = array[i];
	            } else if (array[i] > maxValue) {
	                maxValue = array[i];
	            }
	        }

	 

	        
	        int exponent = 1;
	        while ((maxValue - minValue) / exponent >= 1) {
	        	Sorting_Using_Radix.countingSortByDigit(array, radix, exponent, minValue);
	            exponent *= radix;
	        }
	    }

	 

	    private static void countingSortByDigit(
	            int[] array, int radix, int exponent, int minValue) {
	        int bucketIndex;
	        int[] buckets = new int[radix];
	        int[] output = new int[array.length];

	 

	        
	        for (int i = 0; i < radix; i++) {
	            buckets[i] = 0;
	        }

	 

	        for (int i = 0; i < array.length; i++) {
	            bucketIndex = (int)(((array[i] - minValue) / exponent) % radix);
	            buckets[bucketIndex]++;
	        }

	 

	        
	        for (int i = 1; i < radix; i++) {
	            buckets[i] += buckets[i - 1];
	        }

	 

	        
	        for (int i = array.length - 1; i >= 0; i--) {
	            bucketIndex = (int)(((array[i] - minValue) / exponent) % radix);
	            output[--buckets[bucketIndex]] = array[i];
	        }

	 

	        
	        for (int i = 0; i < array.length; i++) {
	            array[i] = output[i];
	        }
	    }
	    
	    public static void main(String args[])
	    {
	    	Sorting_Using_Radix ob = new Sorting_Using_Radix();
	        int nums[] = {7, -5, 3, 2, 1, 0, 45};
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(nums));
	        ob.sort(nums);
	         System.out.println("Sorted Array:");
	        System.out.println(Arrays.toString(nums));
	        }        
	}