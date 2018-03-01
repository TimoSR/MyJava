public class Algortihm1 {

    public static void main(String[] args) {

        int A[] = {2,1,4,5,6,12,11};

        System.out.println(algo1(A));


    }

    public static int algo1(int[] A){

        if(A[0] >= A[1]) return 0;

        for (int i = 1; i < A.length-2 ; i++) {

            if (A[i-1] <= A[i] && A[i] >= A[i+1]) return i;

        if (A[A.length-2] <= A[A.length-1]) return 0;

        }

        return 0;

    }

}
