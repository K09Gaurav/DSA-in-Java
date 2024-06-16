import java.sql.SQLOutput;

public class BasicRecursion {
    static void print_array(int[] a){
//        for (int i =0; i< a.length; i++){
//            System.out.print(a[i]+" ");
//        }
        for (int i : a){
            System.out.println(i+" ");
        }
    }

    public static void print_n_times(String str,int n){
        if (n==0){
            return;
        }
        System.out.println(str);
        n--;
        print_n_times(str,n);
    }

    public static void print_till(int n,int till){
        if (n == till)
            return;

        System.out.println(n);
        n++;
        print_till(n,till);
    }

    public static void print_1_to_n(int a ,int n){
        if (a!=n){
            System.out.println(a);
            print_1_to_n(a+1,n);
        }
        else return;
    }

    public static void print_n_to_1(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        print_n_to_1(n-1);
    }

    public static void sum_of_1st_n_1(int i,int n){
        if (i == (n*(n+1))/2){
            System.out.println(i);
            return;
        }
        sum_of_1st_n_1(i+1,n);

    }

    static void sum_of_1st_n_2(int n,int i){
        if (n == 0){
            System.out.println(i);
            return;
        }
        sum_of_1st_n_2 (n-1 ,i+n);
    }

    static int sum_of_1st_n_best(int n){
        if (n == 0){
            return 0;
        }
        return  n + sum_of_1st_n_best(n-1);

    }

    static int factorial(int n){
        if (n==0){
            return 1;
        }
        return n * factorial(n-1);
    }

    static void reverse_array(int a[],int start,int n){
        if (start >= n){
            return;
        }
        int temp= a[start];
        a[start] = a[n];
        a[n] = temp;
        reverse_array(a, start +1,n-1);

    }

    static boolean palindrome(String s, int i){
        if (i >= s.length()/2)
            return true;

        if (s.charAt(i) != s.charAt(s.length()-1 -i))
            return false;

        return palindrome(s,i+1);

    }

    static void fibonacci(int l,int r,int n){
        if (n == 0){
            r = r + l;
            System.out.print(r);
            return;
        }
        if(r == 0){
//            System.out.print(r+" ");
            r = 1;
        }
        else {
//            System.out.print(r+" ");
            int t = l;
            l = r;
            r = r + t;
        }
        System.out.println("( "+l+","+r+","+n+")");
        fibonacci(l,r,n-1);

    }

    static int fibonacci(int N){

        // Base Condition.
        if(N <= 1){

            return N;
        }
         return fibonacci(N-1) + fibonacci(N-2);


    }

    public static void main(String[] args) {
//        print_till(5,25);
//        print_n_times("HI Bro",5);
//        print_1_to_n(1,25);
//        print_n_to_1(25);
//        sum_of_1st_n_1(1,25);
//        sum_of_1st_n_2(25,0);
//        System.out.println(sum_of_1st_n_best(25));
//        System.out.println(factorial(5));


//        Reverse array
////        int arr[] = {2,5,7,9,11};
////        print_array(arr);
////        reverse_array(arr,0,arr.length-1);
////        print_array(arr);

//        Palindrome
//        if (palindrome("HaaH",0)){
//            System.out.println("Palindrome");
//        }
//        else System.out.println("Not Plaindrome");

//        fibonacci(0,0,8);
//        System.out.println("\n");
//        for (int i = 0; i <= 9; i++){
//            System.out.println(fibonacci(i));
//        }

    }
}
