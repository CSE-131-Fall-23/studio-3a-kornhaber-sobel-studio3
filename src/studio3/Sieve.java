package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Up to what number should we find prime values to?: ");
		int n = in.nextInt();
		
		int[] nums = new int[n-2];
		
		for(int i = 2; i < n; i++)
		{
			nums[i-2] = i;
		}
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] != 0)
			{
				for(int z = 2; nums[i]*z<n; z++)
				{
					int notPrime = nums[i]*z;
					for(int y = i +1; y < nums.length; y++)
					{
						if(nums[y] == notPrime)
						{
							nums[y] -= notPrime;
						}
					}
				}
			}
		}
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] != 0)
				System.out.println(nums[i]);
		}
	}

}
