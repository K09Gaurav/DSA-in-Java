import java.sql.SQLOutput;

public class BasicMath {
    public static int Countdigit(int N) {
//        int N = 329823;
        System.out.println(N);
        double c;
        c = Math.floor(Math.log10(N)) +1;
//        System.out.println("Using LOg :"+c);
        // Using BruteForce

//        c = 0;
//        while(N>0){
//            c++;
//            N/=10;
//        }
//        System.out.println("Using Simple while loop: "+c);
        return (int)c;
        // Using Optimised Way

//        N = 329823;

    }

    public static int reversenumber(int a) {
//        int a = 1234056;
//        System.out.println(a);

        int n = 0;
        while(a > 0){
            n = n*10 + (a % 10);
            a/=10;
        }


        return n;
    }

    public static void palindrome(int a){
        int b = reversenumber(a);
        if (a == b){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not Palindrome");
        }


    }

    public static void armstrong(int n){
        int a = n;
        int sum = 0;
        int nod = Countdigit(n);
        while(a>0){
            System.out.println("Sum Added, a%1: "+a%10+" power = "+nod);
            sum += Math.pow((a%10),nod);
            a/=10;
        }
        System.out.println(sum);
        if (sum == n){
            System.out.println("Armstorng Number");
        }
        else System.out.println("Not Armstrong Number");
    }

    public static void PrintDivisors(int n){
//        for (int i=1; i<= n; i++){
//            if ((n%i) == 0){
//                System.out.println(i);
//            }
//        }
        int c = 0;
        for (int i=1; i<= Math.sqrt(n); i++){
            if ((n%i) == 0){
                if(n/i == i)
                    c++;
                else c=c+2;
            }
        }
        System.out.println(c);
    }

    public static void CheckPrime(int n){
        int count = 0;
        for (int i = 1; i<=n; i++){
            if (n%i == 0){
                count++;
                System.out.println("Divisible by "+ i);
            }
        }
        System.out.println("No of Charecters" + count);
        if (count == 2)
            System.out.println(n + " is Prime");
        else System.out.println(n + " is Not Prime");

    }

    public static void HCF(int n1, int n2){
        int gcd = 0;
        for (int i = Math.min(n1,n2); i>=1; i--){
            if (n1%i == 0 && n2%i == 0 ){
                gcd = i;
               // System.out.println("Latest GCD = "+ i);
                break;
            }
        }

        System.out.println("Final GCD = " + gcd);
    }


    public static void main(String[] args) {
//        Countdigit(100);
//        reversenumber(500);
//        palindrome(122);
//        armstrong(1634);
//        PrintDivisors(36);
//        CheckPrime(3457);
//        HCF(9,12);

    }
}
