public class duplicate {
    public static void main(String[] args) {
        int arr[]={12, 10,12,15,16,16};
        int result[] = new int[arr.length];
        int j = 0; 
        System.out.println("original array:");
        for(int array=0; array<arr.length; array++)
        {
            System.out.print(arr[array]+" ");
        }
        System.out.println("");
        
        for (int i=0;i<arr.length-1;i++)
       {
         if(arr[i]!=arr[i+1] && arr[i]!=arr[i+2]) 
         {
           result[j] = arr[i]; 
           j++; 
         }
       }
      
       System.out.println("removed duplicates:");
       for (int i = 0; i < result.length; i++) {
           System.out.print(result[i] + " ");
       }
    }
}