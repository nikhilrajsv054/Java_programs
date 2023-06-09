package Array;

public class Max_Min_element {
	
	
    public static int findSum(int A[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Find the minimum and maximum elements in the array
        for (int i = 0; i < N; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }
        
        // Return the sum of the minimum and maximum elements
        return min + max;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	int[] A = {1,2,3,45,-1,43};
	int N = A.length;
	int sumOfMinMax = findSum(A,N);
	System.out.println(sumOfMinMax);

    }

}



//The time complexity of this code is O(N), where N is the size of the input array A. 
//This is because the code iterates through each element in the array once to find the minimum and maximum elements.

//The space complexity of this code is O(1), 
//which means that the amount of memory used by the code does not increase with the size of the input array. 
//This is because the code uses a constant amount of memory to store the variables "min" and "max", 
//regardless of the size of the input array. Therefore, the space complexity of this code is independent of the input size.
