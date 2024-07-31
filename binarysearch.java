import java.util.*;
public class bs{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element in the array:");
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the key to search:");
		int key= sc.nextInt();
		int low=0;
		int high=n-1;
		int mid,flag=0;
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]==key){
				flag=1;
				break;
			}	
			else if(arr[mid]<(key))
				high=mid-1;
			else
				low=mid+1;
		}
		if(flag==1)
			System.out.println("key is found at the index");	
		else
			System.out.println("key is found at the index");		
				
	}
}			
			
