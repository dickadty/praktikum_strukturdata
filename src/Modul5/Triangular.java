package Modul5;

public class Triangular {
    public static int triangleIter(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }

    // recurcion
    public static int triangleRecur(int n) {
        
             return n + triangleRecur(n -1);
         
    }

    public static void main(String[] args) {
        System.out.println(triangleIter(5));
        System.out.println(triangleRecur(5));

    }
}


