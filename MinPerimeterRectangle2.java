/*
	Faster Solution to Codility's Minimum Perimeter of Rectangle Task
	Worst Case Run Time O(sqrt(N))
*/

import java.lang.Math;

class Solution
{
    public int solution(int N)
    {        
        for (int i=(int)Math.sqrt(N); i>1; i--) //Loop From Integer Of Square Root to 2, Find First Factors, Automatically Minimum Perimeter
            if (N%i==0) return (i+N/i)<<1; //Add Factors, Shift Bit Left 1 (Multiply by 2)
        return (++N)<<1; //N is Prime, Only Option is 1 and Itself
    }
}