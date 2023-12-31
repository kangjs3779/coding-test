import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        
        int answer = 0;
        int[] arr = {a, b, c, d};
        Map<Integer, Integer> dice2 = new HashMap<>();

        dice2.put(a, 1);

        for(int i = 1; i < arr.length; i++) {
            if(!dice2.containsKey(arr[i])) {
                dice2.put(arr[i], 1);

            } else {
                dice2.put(arr[i], dice2.get(arr[i]) + 1);
            }
        }

        if(dice2.containsValue(4)) {
            for(int x : dice2.keySet()) {
                answer = 1111 * x;
            }
        } else if(dice2.containsValue(3)) {
            int q = 0;
            int w = 0;

            for(int x : dice2.keySet()) {
                if(dice2.get(x) == 3) {
                    q = x;
                } else {
                    w = x;
                }
            }

            answer = ((10 * q) + w) * ((10 * q) + w);
        } else if(!dice2.containsValue(2)) {
            Set<Integer> keyset = new HashSet<>();
            for(int x : dice2.keySet()) {
                keyset.add(x);
            }
            answer = Collections.min(keyset);
        } else {
            if(dice2.containsValue(1)) {
                List<Integer> list = new ArrayList<>();
                for(int x : dice2.keySet()) {
                    if(dice2.get(x) == 1) {
                        list.add(x);
                    }
                }

                answer = list.get(0) * list.get(1);

            } else {
                List<Integer> list = new ArrayList<>();
                for(int x : dice2.keySet()) {
                    list.add(x);
                }

                answer = (list.get(0) + list.get(1)) * Math.abs(list.get(0) - list.get(1));

            }
        }
        
        
        return answer;
    }
}