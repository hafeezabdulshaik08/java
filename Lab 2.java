import java.util.Scanner;
public class binarysearch
{
	public static int bs(int a[],int key,int n)
	{
		int low = 0;
		int high = n-1;
		int mid;
		
		while(low <= high)
		{
			mid = (low+high)/2;
			if (key == a[mid])
			{
				return mid;
			}
			else if (key < a[mid])
			{
				high = mid-1;
			
			}
			else 
			{
				low = mid+1;
			}
		}
		return -1;
		
	}	
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int i,j,n,key;
	System.out.println("enter the number of elements in the array ");
	n = sc.nextInt();
	int a[] =  new int [n];
	System.out.println("enter the elements of the array");
	for(i = 0;i<n;i++)
	{
		j = sc.nextInt();
		a[i] = j;
	
	}
	System.out.println("enter the key");
	key = sc.nextInt();
	
	
	int result = bs(a,key,n);
	if(result == -1)
	{
		System.out.println("the key is not found");
	}
	else
	{
		System.out.println("the key is found at the index"+result);
	}
}



  import java.util.Scanner;
 public class bubblesort
{
    public static void bs(int a[],int n)
    {
        int i,j,temp;
        for(i = 0; i< n-1 ; i++)
        {
            for(j = 0;j < n -1-i; j++)
            {
                if(a[j] > a[j+1])
                {   
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements of the array");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("enter the elements");
        for(i = 0;i<n;i++)
        {
            j = sc.nextInt();
            a[i] = j;
        }
        bs(a,n);
        for(i = 0; i<n;i++)
        {
            System.out.print("  "+a[i] );
        }
    }


}




import java.util.Scanner;
public class removechar
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String a = sc.nextLine();
        System.out.println("enter the index value to be deleted");
        int n = sc.nextInt();

        StringBuffer s = new StringBuffer(a);
        s.deleteCharAt(n);
        System.out.println("the string after removing character is " + s);
    }
}
	

}
