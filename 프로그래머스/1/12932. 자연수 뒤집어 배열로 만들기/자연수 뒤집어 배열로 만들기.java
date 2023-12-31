class Solution {
    public int[] solution(long n) {
        String s = n + "";
        String[] s1 = s.split("");
        int[] arr = new int[s1.length];
            
        int j = 0;
        for(int i = s1.length - 1; i >= 0; i--) {
            arr[j] = Integer.parseInt(s1[i]);
            j++;
        }
        return arr;
    }
}