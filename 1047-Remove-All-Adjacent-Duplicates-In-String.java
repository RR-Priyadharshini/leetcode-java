class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = res.length();

            
            if (len == 0 || res.charAt(len - 1) != c) {
                res.append(c);
            } 
        
            else {
                res.deleteCharAt(len - 1);
            }
        }

        return res.toString();
    }
}