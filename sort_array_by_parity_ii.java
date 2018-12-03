package solution;

import java.util.Arrays;

public class sort_array_by_parity_ii {
	
	public static void main( String args[])
	{
		int array[] = {3,1,2,4};
		System.out.println(Arrays.toString(sortArrayByParityII(array)));
	}
	
    public static int[] sortArrayByParityII(int[] A) {
        if(A.length < 1)
            return A;
        int half_array = A.length/2;
        int even[] = new int[half_array];
        int odd[] = new int[half_array];
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
        
        int result[] = new int[A.length];
        int index = 0;
        for(int i=0; i<half_array; i++)
        {
        		result[index]=even[i];
        		index++;
        		result[index]=odd[i];
        		index++;
        }
        
        return result;
            
    }

}
