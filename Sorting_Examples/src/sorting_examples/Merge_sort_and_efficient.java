
package sorting_examples;

public class Merge_sort_and_efficient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int arr[]={5,3,7,1,2,4,8,12,95,120,0,45,6,9,10};
        partition(arr,0,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Clock time :"+(finishTime-startTime));
    }
    public static int partition(int arr[],int low,int high)
    {
        for (int i = 0; i <= (low+high)/2  ; i++) {
            for (int j = high-1 ; j >=((low+high)/2); j--) {
                if(arr[i]>arr[j])
                {
                    swap(arr,i,j);
                }
            }
        }
        if(low+1==high)
        {
            return 0;
        }
        return partition(arr,low,(low+high)/2)+partition(arr,(low+high)/2 ,high);
    }
    public static void swap(int arr[],int a,int b)
    {
        int tmp= arr[b];
        arr[b]=arr[a];
        arr[a]=tmp;
    }
    
}
