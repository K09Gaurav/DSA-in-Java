import java.util.ArrayList;
public class Sorting {

    static void print_array(int[] arr){
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    static void Selection_Sort(int []arr){
        for (int i = 0; i<(arr.length)-1;i++){
            int min = i;
            for (int j= i; j<arr.length; j++){
                if (arr[j] < arr[min])
                    min = j;
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
        print_array(arr);
    }

    static void Bubble_Sort(int []arr){
        int n = arr.length;
        int no_of_swaps =0;
        for (int i = n-1;i>=0;i--){
            for (int j = 0; j<i;j++){
                if (arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
                print_array(arr);
                no_of_swaps++;
            }
        }
        System.out.println("No of Swaps: "+ no_of_swaps);
        print_array(arr);
    }

    static void opt_Bubble_Sort(int [] arr){
        int n = arr.length;
        int no_of_swaps = 0;
        for (int i = n-1; i>=0; i--){
            int flag = 0;
            for (int j = 0; j<i;j++){
                if (arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    flag = 1;
                }
                print_array(arr);
                no_of_swaps++;
            }
            if (flag ==0)
                break;
        }

        System.out.println("No of Swaps: "+ no_of_swaps);
        print_array(arr);
    }

    static void Insertion_sort(int [] arr){
        for (int i = 0; i<arr.length; i++){
            int j = i;
            while (j!=0 && arr[j-1]>arr[j]){

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
            }
        }
        //or
//        for (int i = 0; i<arr.length; i++){
//            for (int j=i; j>0; j--){
//                if (arr[j-1]>arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//
//                }else break;
//            }
//        }

        print_array(arr);
    }

    static void Merge_Sort(int[] ar , int low, int high){
        if (low >= high) return;
        int mid = (low + high) / 2;
        Merge_Sort(ar, low, mid);
        Merge_Sort(ar, mid+1, high);
        Merge(ar, low, mid, high);
        print_array(ar);
    }
    static void Merge(int [] ar, int low, int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high){
            if (ar[left] <= ar[right]){
                temp.add(ar[left]);
                left++;
            }
            else {
                temp.add(ar[right]);
                right++;
            }
        }

        while (left <= mid){
            temp.add(ar[left]);
            left++;
        }
        while (right <= high){
            temp.add(ar[right]);
            right++;
        }
        for (int i = low; i<= high; i++){
            ar[i] = temp.get(i - low);
        }
    }

    static void QuickSort(int[] arr, int low, int high){
        if (low < high){
            int partition = partition_index(arr, low, high);
            QuickSort(arr, low, partition - 1);
            QuickSort(arr,partition +1, high);
        }
    }
    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println(temp+" swapped "+ arr[i] );
    }
    static int partition_index(int [] arr,int low, int high){
        int pivot = arr[low];
        int i;

        i = low + 1;

        int j = high;
        while (i < j){
            while (arr[i] < pivot && i< high ){
                ++i;
            }
            while (arr[j] >= pivot && j >= low +1){
                j--;
            }
            if (i<j)
                swap(arr, i,j);
        }
        System.out.println("swapping pivot "+arr[low]);
        if (arr[j] < arr[low])
            swap(arr, j, low);
        System.out.println("Prtition is "+arr[j]);
        print_array(arr);
        return j;
    }

    public static void main(String[] args) {
        int [] arr = {5,6,1,8,3,2,5,3};//{34,56,2,4,546,45,67,76,536,67,66,48,36};
        print_array(arr);
        System.out.println();
//        Selection_Sort(arr);
//        Bubble_Sort(arr);
//        System.out.println();
//        arr = new int[]{34, 56, 2, 4, 546, 45, 67, 76, 536, 67, 66, 48, 36};
//        opt_Bubble_Sort(arr);
//        Insertion_sort(arr);
//        Merge_Sort(arr,0,arr.length-1);
        QuickSort(arr,0,arr.length -1);
    }
}
