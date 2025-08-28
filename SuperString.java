import java.util.*;
public class SuperString {
    public static void main(String[] args) {
        String str="wwwwyyz";
        if(superString(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean superString(String str){
        int n=str.length();
        str=str.toUpperCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            int k='Z'-e.getKey();
            k++;
            if(e.getValue()!=k)
                return false;
        }
        return true;
    }
}
