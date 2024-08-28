// ARRAY1   asssing
import java.util.*;
public class arr1{
	public static void main(String[] args){
		int arr[]=new int[]{10,20,30,40};
		int b[] = new int[4];
		for(int i=0;i<arr.length;i++){
			b[i]=arr[i];
		}
		b[2]=99;
		for(int i:arr){
			System.out.println(i+"");
		}
		System.out.println();
		for(int i:b){
			System.out.println(i+"");
		}
		
	}
	
}






public class arr2{
	public static void main(String[] args){
		int[][][] arr ={ {{1,2},{3,4}} };
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				for(int k=0;k[i][j].length;k++){
					System.out.print(arr[i][j][k]+"");
				}
				System.out.println();	
			}
			System.out.println();	
		}
					
	}
}
