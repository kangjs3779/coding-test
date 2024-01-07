import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        // 1 : 매우 비동의
        // 2 : 비동의
        // 3 : 약간 비동의
        // 4 : 모르겠음
        // 5 : 약간 동의
        // 6 : 동의
        // 7 : 매우 동의

        int[] score = {3,2,1,0,1,2,3};
        Map<String, Integer> typeScore = new HashMap<>();

        for(int i = 0; i < survey.length; i++) {
            String[] type = survey[i].split("");

            if(choices[i] < 4) {
                if (!typeScore.containsKey(type[0])) {
                    typeScore.put(type[0], score[choices[i] - 1]);
                } else {
                    typeScore.put(type[0], typeScore.get(type[0]) + score[choices[i] - 1]);
                }

            } else if (choices[i] > 4) {
                if (!typeScore.containsKey(type[1])) {
                    typeScore.put(type[1], score[choices[i] - 1]);
                } else {
                    typeScore.put(type[1], typeScore.get(type[1]) + score[choices[i] - 1]);
                }
            }
        }


            answer = typeScore.getOrDefault("R", 0) >= typeScore.getOrDefault("T", 0) ? "R" : "T";
        answer += typeScore.getOrDefault("C", 0) >= typeScore.getOrDefault("F", 0) ? "C" : "F";
        answer += typeScore.getOrDefault("J", 0) >= typeScore.getOrDefault("M", 0) ? "J" : "M";
        answer += typeScore.getOrDefault("A", 0) >= typeScore.getOrDefault("N", 0) ? "A" : "N";
        return answer;
    }
}