import java.util.*;
class Solution {
    public String solution(String new_id) {
        String testCase = "-_.";
        String answer = new_id.toLowerCase();
        String [] ansArr = answer.split("");
        ArrayList<String> newArr = new ArrayList<String>();
        answer = "";
        for (String s: ansArr){
            if (Character.isAlphabetic(s.charAt(0)) || Character.isDigit(s.charAt(0)) || testCase.contains(s))
                newArr.add(s);
        }
        for (int i=1; i<newArr.size(); i++){
            if (newArr.get(i).equals(".") && newArr.get(i).equals(newArr.get(i-1)))
                newArr.remove(i--);
        }
        if (newArr.get(0).equals("."))
            newArr.remove(0);
        if (newArr.size()==0)
            newArr.add("a");
        if (newArr.get(newArr.size()-1).equals("."))
            newArr.remove(newArr.size()-1);
        if (newArr.size()>15){
            newArr.subList(15, newArr.size()).clear();
            if (newArr.get(14).equals("."))
                newArr.remove(14);
        }
        while(newArr.size()<3)
            newArr.add(newArr.get(newArr.size()-1));
        for (String s: newArr)
            answer += s;
        return answer;
    }
}