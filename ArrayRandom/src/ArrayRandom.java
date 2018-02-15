import java.util.Scanner;

public class ArrayRandom {

    public static void main(String[] args) {

        System.out.println("Enter the size of the array");

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < A.length; i++) {
            
            A[i] = (int) (Math.random()*100);

            System.out.println(A[i]);

        }

    }

}
