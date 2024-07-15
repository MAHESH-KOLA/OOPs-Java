import java.util.*;
class sort{
 public static void main(String args[]){
 	Scanner in = new Scanner(System.in);
 	int n;
 	System.out.println("enter no. of elements in an array: ");
 	n=in.nextInt();
 	int[] arr = new int[n];
 	System.out.println("enter array elements: " );
 	for(int i=0;i<n;i++){
 	arr[i]=in.nextInt();
 	}
 	System.out.println("given array: " );
 	for(int i=0;i<n;i++){
 	System.out.print(arr[i]+" ");
 	}
 	System.out.println("after sort: " );
 	Arrays.sort(arr);
 	for(int i=0;i<n;i++){
 	System.out.print(arr[i]+" ");
 	}
 	System.out.println("bubble sort: " );
 	for(int i=0;i<n-1;i++){
 	  for(int j=i+1;j<n;j++){
 	  	if(arr[i]>arr[j]){
 	  	int temp=arr[i];
 	  	arr[i]=arr[j];
 	  	arr[j]=temp;
 	  	}
 	  }
 	 }
 	 for(int i=0;i<n;i++){
 	System.out.print(arr[i]+" ");
 	}
  	return;
 	}
}
    
