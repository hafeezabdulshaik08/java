public class excep
{
    public static void main(String [] args)
    {
        int i = 9;
        int j = 3;
        int k = 0;
        try
        {
            k = i/j;
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }

        System.out.println(k);
        System.out.println("end of program");
    }
}

//2
public class BuiltInExceptionsExample {
    public static void main(String[] args) {
        try {
           
            int a = 10;
            int b = 0;
            int c = a / b; 
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }

        try {
            
            int[] array = new int[5];
            array[10] = 20; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }


        System.out.println("End of program");
    }
}

//3
public class multiplecatch
{
    public static void main(String [] args)
    {
        int i = 3;
        int j = 9;
        int k = 0;
        int arr[] = new int[5];
        try
        {
            k = j/i;
            System.out.println(arr[5]);
            System.out.println(arr[1]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("cannot be divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of limit");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
    }
}

//4
public class multiplecatch
{
    public static void main(String [] args)
    {
        int i = 3;
        int j = 9;
        int k = 0;
        int arr[] = new int[5];
        try
        {
            k = j/i;
            System.out.println(arr[5]);
            System.out.println(arr[1]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("cannot be divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of limit");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
    }
}
