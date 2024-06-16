import java.util.HashMap;

public class BasicHashing {
    static void ArrayNumericHash(){
        int[] arr = {1,2,1,1,2,2,2,3,3,4,3,2,2,5,2,1,4,5,3,1,3,4,5,5,3,2,2,3,3,4,5,3,3,2,4};

        int[] hash = new int[6];

        for (int j : arr) {
            hash[j] += 1;
        }

        for (int i=1; i< hash.length; i++){
            System.out.println(i+":"+hash[i]);
        }

    }

    static void ARRAYCharacter_Hash(){
        String str = "alkbhGrflhuiuilboaDGqDergFHqguewbTGulekrfwJYeghvGDehdgrfa";
        int []hash = new int[123];

        for (int i =0; i< str.length(); i++){
            hash[str.charAt(i)]++;
        }

        for (int i = 0; i< hash.length; i++){

            System.out.println((char)(i) + ":" + hash[i]);
        }
    }

    static void Hashing_map(){
        String str = "alkbhGrflhuiuilboaDGqDergFHqguewbTGulekrfwJYeghvGDehdgrfa";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++){
            int freq = 0;
            if(map.containsKey(str.charAt(i))) freq = map.get(str.charAt(i));
            freq++;
            map.put(str.charAt(i),freq);
        }

        for (Character i : map.keySet()){
            System.out.println(i+":"+map.get(i));
        }
        System.out.println();

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Character i : map.keySet()){
            int val = map.get(i);
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.println("MAx :"+max+", Min :"+min);
    }

    public static void main(String[] args) {
//        ArrayNumericHash();
//        System.out.println();
//        ARRAYCharacter_Hash()
//
        Hashing_map();

    }
}
