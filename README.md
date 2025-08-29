# Flames-Game

import java.util.*;
public class FlamesFinder {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        System.out.println("Enter the Names :");
        String str1=kk.next();
        String str2=kk.next();
       // flames(str1,str2);
        System.out.println(flames(str1,str2));
    }
    public static String flames(String s1, String  s2){
        List<Character> l1=new ArrayList<>();
        List<Character> l2=new ArrayList<>();
        for(char c:s1.toLowerCase().toCharArray())
            l1.add(c);
        for(char c:s2.toLowerCase().toCharArray())
            l2.add(c);
        Iterator<Character> it=l1.iterator();
        while(it.hasNext()){
            char x=it.next();
            if(l2.contains(x)) {
                it.remove();
                l2.remove((Character) x);
            }
        }
         int k=l1.size() + l2.size();
        System.out.println(k);
          String str="flames";
          LinkedList<Character> list=new LinkedList<>();
          for(char c:str.toCharArray())
              list.add(c);
          Iterator<Character> it1=list.iterator();
          while(list.size()>1){
              int count=0;
              while(count<k){
                  while(it1.hasNext() && count<k){
                      it1.next();
                      count++;
                  }
                  if(count<k){
                      it1=list.iterator();
                      it1.next();
                      count++;
                  }
              }
              it1.remove();
          }
       switch (list.getFirst()){
           case 'f':
               return "Friendship";
           case 'l':
               return "Love";
           case 'a':
               return "Attraction";
           case 'm':
               return "Marriage";
           case 'e':
               return "Enemy";
           case 's':
               return "Sisters";
       }
          return "Nothing";
    }
}
