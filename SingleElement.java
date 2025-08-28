    // input: {1,1,2,3,3,4,4,5,5}
    // output: 2
import java.util.*;
public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2,2, 3, 4, 5, 5};
//        int result=0;
//        for(int i=0;i<arr.length;i++)
//        result=result^arr[i];
//        System.out.println(result);
//        int result=0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] != arr[i + 1]) {
//                result = arr[i];
//                break;
//            }
////            else
////                result=arr[i];
//            i += 1;
//        }
//        if(result==0)
//            result=arr[arr.length-1];
//        System.out.println(result);
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1) {
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
