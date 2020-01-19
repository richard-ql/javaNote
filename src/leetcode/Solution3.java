package leetcode;

public class Solution3 {
	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}
    public static int lengthOfLongestSubstring(String s) {
        int start=0;
        int longest=0;
        boolean[] visited= new boolean[256];
        
        
        for(int i=0;i<s.length();i++) {
        	System.out.println((int)s.charAt(i));
        	if(visited[(int)s.charAt(i)]) {
        		while(s.charAt(i)!=s.charAt(start)) {
        			visited[(int)s.charAt(start)]=false;
        			start++;
        		}
        		start++;	
        	}else {
        		visited[(int)s.charAt(i)]=true;
        	}
        	longest = Math.max(longest, i-start+1);
//        	System.out.println(longest);
        }
        
        return longest;
    }
}
