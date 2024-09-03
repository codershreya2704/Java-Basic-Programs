public class fabonnaci {
    public static void main(String[] args) 
    //0 1 1 2 3 5, 8
    {
        int num= 10;
        int a=0;
        int b=1;
        int c;
         
        for(int i=1; i<=num; i++)
        {
            
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
    
}
