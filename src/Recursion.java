
public class Recursion {
    //   Tail Recursion
    public static void countBackward(int n){
        if (n == 0){
            System.out.println("Done");
        } else {
            System.out.println(n);
            n --;
            countBackward(n);
        }
    }


    //    Head Recursion
    public static void countForward(int n){

        if (n == 0){
            // Do nothing
        } else {
            n --;
            countForward(n);
            System.out.println(n);
        }

    }
    // Head Recursion with object
    public int countForwardObj(int n){
        if (n>0){
            countForward(n-1);
            System.out.println(n);
            return n;
        } else {
            System.out.println("Done");
            return 0;
        }
    }

    public static void main(String[] args) {
        countBackward(10);

        countForward(10);

        Recursion recursion = new Recursion();
        recursion.countForwardObj(10);


    }
}