class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zero_count = 0;


        for(int i = 0; i < lottos.length; i++) {
            for(int t = 0; t < win_nums.length; t++) {
                if(lottos[i] == win_nums[t]) {
                    count++;
                    break;
                } else if(lottos[i] == 0) {
                    zero_count++;
                    break;
                }
            }
        }

        int[] answer = {zero_count + count, count};

        for(int i = 0; i < 2; i++) {
            switch (answer[i]) {
                case 6 : answer[i] = 1; break;
                case 5 : answer[i] = 2; break;
                case 4 : answer[i] = 3; break;
                case 3 : answer[i] = 4; break;
                case 2 : answer[i] = 5; break;
                case 1 :
                case 0 : answer[i] = 6; break;

            }
        }
        return answer;
    }
}