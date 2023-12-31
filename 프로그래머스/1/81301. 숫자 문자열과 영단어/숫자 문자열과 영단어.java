import java.util.*;

class Solution {
    public int solution(String s) {
                List<String> list = new ArrayList<>();
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");


        for(int i = 0; i < 10; i++) {
            String j = "";
            j += i;

            if (s.contains(list.get(i))) {
                s = s.replaceAll(list.get(i), j);
                System.out.println(list.get(i));
            }
        }

        int answer = Integer.parseInt(s);
        return answer;
    }
}