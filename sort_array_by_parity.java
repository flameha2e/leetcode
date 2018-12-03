package solution;

import java.util.Arrays;

public class sort_array_by_parity {
	
	public static void main( String args[])
	{
		int array[] = {3,1,2,4};
		System.out.println(Arrays.toString(sortArrayByParity(array)));
	}
	
    public static int[] sortArrayByParity(int[] A) {
        if(A.length < 1)
            return A;
        int even[] = new int[A.length];
        int odd[] = new int[A.length];
        int indexEven = 0;
        int indexOdd = 0;
        for(int i=0; i< A.length; i++)
        {
            if(A[i]%2==0)
            {
                even[indexEven]=A[i];
                indexEven++;
            }
            else
            {
                odd[indexOdd]=A[i];
                indexOdd++;
            }
        }
        System.arraycopy(odd,0, even, indexEven, indexOdd);
        
        return even;
            
    }

}
