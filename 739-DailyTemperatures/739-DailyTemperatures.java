// Last updated: 2/13/2026, 9:46:38 AM
class Solution {
    public int[] dailyTemperatures(int[] t) {
        int arr[] = new int[t.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < t.length; i++) {
            if (t[st.peek()] < t[i]) { 
                while (!st.isEmpty() && t[st.peek()] < t[i]) {
                    arr[st.peek()] = i - st.peek();  
                    st.pop(); 
                }
                st.push(i);
            } else {
                st.push(i);
            }
        }
        return arr;
    }
}
