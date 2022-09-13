import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1
        new_id = new_id.toLowerCase();
 
        //2
        String new_new_id = "";
        for(int i = 0; i < new_id.length(); i++){
            int ascii = (int)new_id.toCharArray()[i];
            if(ascii == 45 || ascii == 46 || (ascii >= 48 && ascii <= 57) || ascii == 95 || (ascii >= 97 && ascii <= 122))
                new_new_id += new_id.toCharArray()[i];
        }
        
        //3
        new_id = "";
        new_id += new_new_id.toCharArray()[0];
        
        for(int i = 1; i < new_new_id.length(); i++){
            int first = (int)new_id.toCharArray()[new_id.length()-1];
            int second = (int)new_new_id.toCharArray()[i];
            
            if(first != second)
            {
                new_id += new_new_id.toCharArray()[i];
            } else {
                if(first != 46 && second != 46) {
                    new_id += new_new_id.toCharArray()[i];
                }
            }
        }
        
        //4        
        if(new_id.charAt(0) == '.')
            new_id = new_id.substring(1);
        
        if(new_id.length() != 0) 
        {
            String lastch = new_id.substring(new_id.length() - 1);
            if(lastch.equals("."))
                new_id = new_id.substring(0, new_id.length() - 1);            
        }

        //5
        if(new_id.length() == 0) {
            new_id = "a";
        }
        
        //6
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);              
        }
        
        if(new_id.length() != 0) 
        {
            String lastch = new_id.substring(new_id.length() - 1);
            if(lastch.equals("."))
                new_id = new_id.substring(0, new_id.length() - 1);             
        }
        
        //7
        if(new_id.length() <= 2) {
            String lastch = new_id.substring(new_id.length() - 1);
            
            while(new_id.length() < 3) {
                new_id += lastch;
            }
        }

        answer = new_id;
        return answer;
    }
}