/*
	Solution to Codility's Minimum Perimeter of Rectangle Task
	Run Time O(sqrt(N))
*/

import java.lang.Math;

class Solution 
{
    public int solution(int N) 
    {
        int A = 1; //Factor 1
        int B = N; //Factor Number Itself
        
        for (int i=2; i<=Math.sqrt(N); i++) //Loop Till Square Root
        {
            if (N%i==0) //If Divides Evenly
            {
                A = i; //Update Factors
                B = N/i; //New Minimum Perimeter
            }
        }
        
        return 2*(A+B); //Equation to Calculate Perimeter, Return Max
    }
}