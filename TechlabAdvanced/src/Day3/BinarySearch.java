package Day3;

public class BinarySearch {


public static void main(String args[]){  
	        int arr[] = {1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 57};  
	        int answer = 22;  
	        int high=arr.length-1;  
	        binarySearch(arr,0,high,answer);     
	 }  
	
	 public static void binarySearch(int arr[], int low, int high, int answer){  
		   int mid = (low + high)/2;  
		   while( low <= high ){  
		      if ( arr[mid] < answer ){  
		        low = mid + 1;     
		      }else if ( arr[mid] == answer ){  
		        System.out.println("Element is found on index: " + mid);  
		        break;  
		      }else{  
		         high = mid - 1;  
		      }  
		      mid = (low + high)/2;  
		   }  
		   if ( low > high ){  
		      System.out.println("Element was not found!");  
		   }  
		 }  
	}
