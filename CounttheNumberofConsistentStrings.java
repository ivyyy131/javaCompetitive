
public class CounttheNumberofConsistentStrings {
	public int countConsistentStrings(String allowed, String[] words) {
		int ans = 0;
		for(int i=0; i<words.length; i++) {
			String s = words[i];
			boolean flag = true;
			for(int j=0; j<s.length();j++) {
				if(allowed.indexOf(s.charAt(j))==-1) {
					flag=false;
					break;
				}
			}
			if(flag) ans++;
		}
		return ans;
    }
	
	public int countConsistentStrings2(String allowed, String[] words) {
	    int res = 0;
	    for (String word : words)
	        if (word.matches("[" + allowed + "]*"))
	            res += 1;
	    return res;
	}

	public static void main(String[] args) {
		String allowed = "ab";
	    String[] words = {"ad","bd","aaab","baa","badab"};
		int ans = new CounttheNumberofConsistentStrings().countConsistentStrings(allowed, words);
		System.out.println(ans);
		
		String allowed2 = "cad";
	    String[] words2 = {"cc","acd","b","ba","bac","bad","ac","d"};
		int ans2 = new CounttheNumberofConsistentStrings().countConsistentStrings(allowed2, words2);
		System.out.println(ans2);
	}

}
