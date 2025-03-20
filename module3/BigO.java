package module3;

public class BigO {
// Big O = Operations

    public static void main(String[] args) {
        //printBigO(100);
        //printBigOSquared(8);
        //System.out.println(printOOne(8));
        //OLogNWithRecursion(8.0);
        //OLogNWithNoRecursion(8.0);
        ONLogN(100.0);
        System.out.println("Counter: " + counter);
    }

    // 0(n) - The number of operations performed is equal to n or the number of times
    //        The loop is going to execute
    public static void printBigO(int n) {
        for(int i = 0; i < n; i++){
            //System.out.println(i);
            counter++;
        }
    }

    // 0(n^2) - The number of operations will be n*n times
    public static void printBigOSquared(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    // 0(1) - The number of operations will always be the same
    //      - This does NOT mean there is only 1 operation!
    public static Integer printOOne(int n){
        return n+n;
    }

    // 0(log*n) - Best Understood through recursion
    //          - Log base in CS is always 2
    public static void OLogNWithRecursion(double n){
        if(n > 1){
            n = Math.floor(n/2);
            System.out.println("The loop has started");
            OLogNWithRecursion(n);
        }
        System.out.println("The loop has finished");
    }

    // Same method, without recursion
    public static void OLogNWithNoRecursion(double n){
        for (int i = 0; n > 1; i++) {
            System.out.println(i);
            n = Math.floor(n / 2);
        }
    }

    //O(n*log*n) - Two parts
    //           - First: outer loop which is dictated by the while loop and us
    //                    dividing n/2
    //              - This is identical to O(log*n) function
    //           - Second: inner loop aka the for loop that will iterate as many
    //                     times equal to n, therefore running at a complexity of n
    //           - When you combine these parts you get a complexity of O(n * log n)
    static int counter = 0;

    public static void ONLogN(double n){
        double y = n;
        while(n > 1){
            n = Math.floor(n / 2);
            for (int i = 0; i <= y ; i++) {
                //System.out.println(i);
                counter++;
            }
        }
    }
}
