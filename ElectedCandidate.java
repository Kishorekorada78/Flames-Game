//    Given an array of names arr[] of candidates in an election.
//    A candidate name in array represents a vote casted to the candidate.
//    You need to find the candidate with maximum votes recieved in the election.
//        Examples:
//    Input: arr[] = ["Shrikant", "Sushma", "Rajnath", "Sushma"]
//    Output: Sushma
//    Explanation: Here Sushma has 2 votes and Rajnath has 1 vote.
//            Input: arr[] = ["Atal", "Shashtri", "Atal"]
//    Output: Atal
//    Explanation: Here Atal has max votes of 2.
  import java.util.*;
  import java.util.function.IntUnaryOperator;

public class ElectedCandidate {
    public static void main(String[] args) {
        String arr[] = {"Shrikant", "Sushma", "Rajnath", "Sushma"};
        System.out.println(electedCan(arr));
    }
    public static String electedCan(String[] arr){
        LinkedHashMap<String , Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int min=Integer.MIN_VALUE;
        String str="";
        for(Map.Entry<String, Integer> e:map.entrySet()){
            if(e.getValue()>min){
                min=e.getValue();
                str=e.getKey();
            }
        }
        return str;
    }
}
