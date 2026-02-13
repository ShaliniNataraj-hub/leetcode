// Last updated: 2/13/2026, 9:46:34 AM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for(int i=0; i<indices.length; i++){
            result[indices[i]]= s.charAt(i);
        }
        return new String(result);
    }
}