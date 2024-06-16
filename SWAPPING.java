
class Swapper {
    int value;

    Swapper(int value) {
        this.value = value;
    }
}


public class SWAPPING {

    static void swap(Swapper a,Swapper b) {
        int temp = b.value;
        b.value = a.value;
        a.value = temp;
    }

//    static void Bubble_sort


    public static void main(String [] args){
        Swapper x = new Swapper(5);
        Swapper y = new Swapper(8);
        System.out.println(x.value +" "+ y.value);
        swap(x,y);
        System.out.println(x.value +" "+ y.value);

    }
}
