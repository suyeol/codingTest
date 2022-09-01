import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int standard = 4;
        
        // 초기화
        HashMap<String, Integer> mapRT = new HashMap<String, Integer>();
        mapRT.put("R", 0);
        mapRT.put("T", 0);
        
        HashMap<String, Integer> mapCF = new HashMap<String, Integer>();
        mapCF.put("C", 0);
        mapCF.put("F", 0);
        
        HashMap<String, Integer> mapJM = new HashMap<String, Integer>();
        mapJM.put("J", 0);
        mapJM.put("M", 0);
        
        HashMap<String, Integer> mapAN = new HashMap<String, Integer>();
        mapAN.put("A", 0);
        mapAN.put("N", 0);
        
        // 점수 계산
        for(int i = 0; i < survey.length; i++)
        {
            int point = choices[i];
            int num = 0;
            if(point == standard)
            {
                //점수 없음
                continue;
            } else if(point > standard)
            {
                //뒤에 글자
                num = 1;
                point = point - standard;
            } else {
                //앞에 글자
                num = 0;
                point = standard - point;
            }
            
            switch(survey[i].charAt(num))
            {
                case 'R':
                case 'T':
                    int value = mapRT.get(String.valueOf(survey[i].charAt(num))) + point;
                    mapRT.replace(String.valueOf(survey[i].charAt(num)), value);                    
                    break;
                case 'C':
                case 'F':
                    value = mapCF.get(String.valueOf(survey[i].charAt(num))) + point;
                    mapCF.replace(String.valueOf(survey[i].charAt(num)), value);                    
                    break;
                case 'J':
                case 'M':
                    value = mapJM.get(String.valueOf(survey[i].charAt(num))) + point;
                    mapJM.replace(String.valueOf(survey[i].charAt(num)), value);                    
                    break;
                case 'A':
                case 'N':
                    value = mapAN.get(String.valueOf(survey[i].charAt(num))) + point;
                    mapAN.replace(String.valueOf(survey[i].charAt(num)), value);                    
                    break;                    
            }
        }
        
        //점수 산정

        //RT 
        int num1 = mapRT.get("R");
        int num2 = mapRT.get("T");
        if(num1 == num2)
        {
            // R
            answer += "R";
        } else if (num1 < num2)
        {
            // T
            answer += "T";
        } else {
            // R
            answer += "R";
        }
        
        //CF
        num1 = mapCF.get("C");
        num2 = mapCF.get("F");
        if(num1 == num2)
        {
            // C
            answer += "C";
        } else if (num1 < num2)
        {
            // F
            answer += "F";
        } else {
            // C
            answer += "C";
        }
        
        //JM
        num1 = mapJM.get("J");
        num2 = mapJM.get("M");
        if(num1 == num2)
        {
            // J
            answer += "J";
        } else if (num1 < num2)
        {
            // M
            answer += "M";
        } else {
            // J
            answer += "J";
        }
        
        //AN
        num1 = mapAN.get("A");
        num2 = mapAN.get("N");
        if(num1 == num2)
        {
            // A
            answer += "A";
        } else if (num1 < num2)
        {
            // N
            answer += "N";
        } else {
            // A
            answer += "A";
        }        
        
        
        return answer;
    }
}