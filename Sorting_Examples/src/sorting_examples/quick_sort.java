package sorting_examples;



public class quick_sort {
    public static void main(String[] args) {
        int arr[]={7,9,1,8,5};
        partition(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void quicksort(int arr[],int start,int end)
    {
             if(end<=start) return;//base case
             
             int pivot = partition(arr,start,end);
             quicksort(arr,start,pivot-1);
             quicksort(arr,pivot+1,end);
    }
    public static int partition(int[] array,int start,int end)
    {
            int pivot =  array[end];
            int i = start-1;
            
            for (int j = start ; j <= end-1; j++) {
                if(array[j]<pivot)
                {
                    i++;
                    int temp= array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }    
            
        }
            i++;
            int temp= array[i];
            array[i]=array[end];
            array[end]=temp;
            
            return i;
    }
    
   
    
}
