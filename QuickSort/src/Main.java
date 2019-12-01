public class Main {
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i =0 ; i<n ; i++)
            System.out.println(arr[i]+" ");
    }

    public static void main(String[] args) {
        int arr[] = {10,5,65,7,89,2,0,1,23,1};
        int n = arr.length;

        System.out.println("Non sorted array -> ");

        for (int i= 0;i<n;i++)
        System.out.println(arr[i]);

        Sort ss = new Sort();
        ss.sort(arr,0,n-1);

        System.out.println("Sorted array ->");
        printArray(arr);
    }
}
