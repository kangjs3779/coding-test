class Solution {
    public int solution(int num) {
        long n = num;

        int answer = 0;

        while (answer <= 500) {
            if(n == 1 || answer == 500) {
                answer = answer == 500 ? -1 : answer;
                break;
            } else if((n % 2) == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }

            answer++;
        }
        
        return answer;
    }
}