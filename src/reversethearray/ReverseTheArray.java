package reversethearray;

public class ReverseTheArray {

    public static void main(String[] args) {
        
    }
    
    public static int [] reverse (int []a)
    {
        int N = a.length;
        int [] tempA = new int [N];
        for (int i=0; i<N; i++)
        {
            tempA[i] = a[N-i-1];
        }
        return tempA;
    }
}
