// using try and cache

public class exception1 {
    
    public static void main(String args[])
    {
        int i,j,k=0;
        i=8;
        j=0;
        try
        {
            k=i/j;
        }
         catch(Exception e)
         {
            System.out.println(e);
         }
    }
}
