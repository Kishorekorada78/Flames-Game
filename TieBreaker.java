//        Given an array of names arr[] of candidates in an election.
//        A candidate name in array represents a vote casted to the candidate.
//        You need to find the candidate with maximum votes recieved in the election.
//                It may happen that two or more candidates may have same votes, in that case you need to return the name of the candidate which comes first lexicographically in dictionary.
//
//        Examples:
//        Input: arr[] = ["Turin", "Nick", "Turin", "Nick"]
//        Output: Nick
//        Explanation: Both have the same 2 number of votes but Nick comes first lexicographically.
//        Input: arr[] = ["John", "Shushma", "Rajnath"]
//        Output: John
//        Explanation: All the three have same number of votes of 1. Lexicographically John comes first.
//
import java.util.*;
public class TieBreaker {
    public static void main(String[] args) {
       String arr[] = {"Turin", "Nick", "Turin", "Nick"};
       System.out.println(Tiebreaker(arr));
    }
    public static String Tiebreaker(String[] arr){
        LinkedHashMap<String ,Integer> map=new LinkedHashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
                int max=0;
               String str1="";
               for(Map.Entry<String,Integer> e:map.entrySet()){
                   String str2=e.getKey();
                   int value=e.getValue();
                   if(value>max){
                       str1=str2;
                       max=value;
                   }else if(max==value){
                       str1=str2;
                   }
               }
               return str1;
    }
}
