//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
	 boolean negative = s.charAt(0) == '-';
	    int i = negative ? 1:0, num = 0;
	    for (; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (!Character.isDigit(c))
	            return -1;
	        num = num * 10 + c - '0';
	    }
	    return negative?-num:num;
    }
}
