import java.awt.*;
import java.util.*;
import java.util.List;

public class CollectionsPractise {
    public static void main(String[] args) {
        // --> Vector
        // * default capacity is 10
        // * initial capacity is 10
        // * it is increased 100% i.e., 10 20 40 80
        // * it allows duplicate elements
        // * it allows null values
        // * it maintains the insertion order
        // * it doesnot maintain the sorted order
        // * it offers the random access of thr elements
        // * it is Syncronized
        // * it is good at multi threading , data is increased exponentially.
//        Vector v1=new Vector(20);
//        v1.add("Kishore");
//        v1.add("Vasu");
//        v1.add(0,"Raju");
//       Vector v2=new Vector();
//       v2.add("s1");
//       v2.add("s2");
//       v2.add("Kishore");
//       v1.addAll(v2);
//       v1.set(2,"Nikhilesh");
//       System.out.println(v1.lastIndexOf("Kishore"));
//       System.out.println(v1.isEmpty());
//        System.out.println(v1);
//   Object[] arr=new Object[]{1,2,3,4};
//   Vector<Integer> v1=new Vector<>();
//   v1.add(2);
//   v1.add(null);
//   v1.add(null);
//   System.out.println(v1);
//        System.out.println(v1.size());
        // --> ArrayList
        // * default capacity is 0.
        // * initial capacity is 10.
        // * it is increased 50% i.e., 10 15 22..
        // * it allows duplicate elements.
        // * it allows null values.
        // * it maintains the insertion order.
        // * it doesnot maintain the sorted order.
        // * it offers the random access of thr elements.
        // * it is not  Synchronized but using collections class we can make it as synchronized.
        // * it is good at only data storing and data retrieval.
//        Integer[] arrr=new Integer[]{1,2,3,4,5};
//        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arrr));
//       al.add(1);
//       al.add(6);
//       al.add(9);
//      ArrayList<Integer> al2=new ArrayList<>();
//      al2.add(10);
//      al2.add(20);
//      System.out.println(al2.toArray()[0]);
//       al2.add(22);
//       al2.add(11);
//       al2.add(88);
//       al.addAll(al2);
//      // al.remove(2);
//        System.out.println(al.contains(2));
//        System.out.println(al);
//        for(Integer x:al)
//            System.out.print(x+" ");
//        Integer[] arr=new Integer[]{1,0,3,4,0,9,0};
//        ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
//        System.out.println(al);
//        int count=0;
//        for(int i=0;i<al.size();i++){
//            if(al.get(i)==0) {
//                al.remove(i);
//                count++;
//            }
//        }
//        for(int i=0;i<count;i++)
//            al.add(0);
//    System.out.print(al)
        // --> Stack [ stack is a class in java which  implements the list interface and extends the vector class and also represents the lifo principle.
        // * default capacity is 10
        // * initial capacity is 10
        // * it is increased 100% i.e., 10 20 40 80..
        // * it allows duplicate elements
        // * it allows null values
        // * it maintains the insertion order
        // * it doesnot maintain the sorted order
        // * it offers the random access of thr elements but we should not use it.
        // * it is Syncronized
        // * it is good at Lifo
//        Stack<Integer> st = new Stack<>();
//        st.push(90);
//        st.push(1);
//        st.push(87);
//        st.push(3);
//        st.push(977);
//        int val=1;
//        System.out.println(st.search(val));
//        for(int i=0;i<st.size();i++)
//        System.out.print(st.get(i)+" ");

        // --> LinkedList
//         LinkedList<Integer> ll=new LinkedList<>();  // valid
//         Queue<Integer> ll1=new LinkedList<>();      // valid
//         Deque<Integer> ll2=new LinkedList<>();      // valid
//         Collection<Integer> ll3=new LinkedList<>(); // valid
//         Iterable<Integer> ll4=new LinkedList<>();   // valid
//           Queue<Integer> ll1=new ArrayList<>();     // Invalid
        // traversing forward
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        ListIterator<Integer> it = list.listIterator(list.size());
//        while (it.hasPrevious()) {
//            System.out.print(it.previous() + " ");
//        }
//        System.out.println();
//        ListIterator<Integer> it2 = list.listIterator();
//        while (it2.hasNext()) {
//            System.out.print(it2.next() + " ");
//        }
//        System.out.println();
//        while(it.hasNext()){
//            int x=it.next();
//            it.set(x*2);
//        }
//        System.out.print(list);
//        System.out.println();
//        while(it.hasNext()){
//            it.add(5);
//            it.next();
//        }
//        System.out.println(list);
//        int[]arr={1,2,3,4,5};
//        ArrayList<Integer> even=new ArrayList<>();
//        ArrayList<Integer> odd=new ArrayList<>();
//        even.rev
//        for(int n:arr){
//            if(n%2==0)
//                even.add(n);
//            else
//                odd.add(n);
//        }
//        for(int i=0;i<even.size();i++)
//        {
//            System.out.print(even.get(i));
//            if(i<even.size()-1)
//                System.out.print(" ");
//        }
//        System.out.println();
//        for(int i=0;i<odd.size();i++)
//        {
//            System.out.print(odd.get(i));
//            if(i<odd.size()-1)
//                System.out.print(" ");
//        }
        // balanced parenthesis
//        String str = "[{([)}]";
//        System.out.println(isMatching(str));
//    }
//
//    public static boolean isMatching(String str) {
//        Stack<Character> st = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char x = str.charAt(i);
//            if (x == '[' || x == '{' || x == '(')
//                st.push(x);
//            else {
//                if (st.isEmpty())
//                    return false;
//                else if (isbalan(st.peek(), x) == false)
//                    return false;
//                else
//                    st.pop();
//            }
//        }
//        return st.isEmpty() == true;
//
//    }
//
//    static boolean isbalan(char open, char close) {
//        return (open == '[' && close ==']') ||(open == '{' && close =='}') ||(open == '(' && close ==')');


        //stockpan
//        int[] arr={60, 10, 20, 40, 35, 30, 50, 70, 65};
//        stockpan(arr);
//    }
//    static void stockpan(int[] arr){
//        int n=arr.length;
//        int span=1;
//        System.out.print(span+" ");
//        Deque<Integer> stack=new ArrayDeque<>();
//        stack.push(0);
//        for(int i=1;i<n;i++){
//            while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
//                     stack.pop();
//            span=stack.isEmpty()?i+1:(i-stack.peek());
//            System.out.print(span+" ");
//            stack.push(i);
//        }
//    }

//  public static void stackpan(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            int span=1;
//            for(int j=i-1;j>=0 && arr[j]<=arr[i];j--){
//                span++;
//            }
//        System.out.print((int)Math.ceil(5/2));
//        }
        //O(n)
//        int arr[] = {20, 30, 10, 5, 15};
//
//        prevGreater(arr);
//       }
//       static void prevGreater(int[] arr){
//        int pg=-1;
//        System.out.print(pg+" ");
//        Deque<Integer> stack=new ArrayDeque<>();
//        stack.push(arr[0]);
//        for(int i=1;i<arr.length;i++){
//              while(stack.isEmpty()==false && stack.peek()<=arr[i]){
//                  stack.pop();
//              }
//              pg=(stack.isEmpty())?-1:stack.peek();
//              System.out.print(pg+" ");
//              stack.push(arr[i]);
//        }
        // creation of map
//        Map<Integer, String> map=new HashMap<>();
//        map.put(100,"a");
//        map.put(101,"ab");
//        map.put(102,"abc");
//        map.put(103,"abcd");et();
//        Collection<String> value=map.values();
////        Set<Integer> keys=map.keySap.values();
//        for(Integer key:keys)
//            System.out.println(key+"   "+map);

        // Enumeration - Interface
        // Introduced for iterating the legacy collection objects
        // legacy classes- v1.0 i.e.. HashTable,vector,Dictionary and properties
        // new classes - v1.2
//         Stack<String> v=new Stack<>();
//          v.add("ab");
//          v.add("abc");
//          v.add("abcd");
//          Enumeration<String> e=v.elements();
//          //e.nextElement();
//          //e.hasMoreElements();
//        while(e.hasMoreElements()){
//            System.out.println(e.nextElement());
//        }
//        Hashtable<String,Integer> hs=new Hashtable<>();
//        hs.put("a",1);
//        hs.put("b",2);
//        hs.put("c",3);
//        Enumeration<Integer> e=hs.elements();
//        while(e.hasMoreElements())
//            System.out.println(e.nextElement());
//        Properties pro=new Properties();
//        pro.setProperty("dsd","ksdsds");
//        pro.setProperty("bfd","3eew");
//        Enumeration<Object> e=pro.elements();
//        while(e.hasMoreElements())
//            System.out.println(e.nextElement());

        // Iterator -Interface
        // Introduced for iterating all collection objects
        // legacy classes - v1.0 + new classes v1.2
        // one direction , read only with special permission for removing the elements
        // it does not perform direct operation on Maps
//        ArrayList<Integer> al=new ArrayList<>();
//        al.add((10));
//        al.add(21);
//        al.add(30);
//        Iterator<Integer> it=al.iterator();
//        //it.hasNext();
//        //it.next();
//        // it.remove();
////        while(it.hasNext())
////            System.out.println(it.next());
//        // using remove
//        while(it.hasNext()){
//           // it.remove(); // it shows exception
//           if( it.next()%2==0)  // use first next() then remove
//            it.remove();
//        }
//        System.out.println(al);
//        HashMap<String,Integer> hs=new HashMap<>();
//        hs.put("kis",11);
//        hs.put("hor",12);
//        //hs.iterator(); // it shows errors
//        hs.keySet().iterator();
//        hs.values().iterator();
//        hs.entrySet().iterator();
//        String[] arr={"ab","abc","ab","kis"};
//        HashMap<String,Integer> map=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        String str=null;
//        int max=Integer.MIN_VALUE;
//        for(Map.Entry<String,Integer> e:map.entrySet()){
//            if(e.getValue()>max){
//                str=e.getKey();
//                max=e.getValue();
//            }
//        }
//
//            System.out.println(str);
//        int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 6, 7};
//        HashMap<Integer,Integer> map=new HashMap<>();
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        int count=0;
//        for(Map.Entry<Integer,Integer> e:map.entrySet())
//        {
//            if(e.getValue()==1)
//                count++;
//        }
//        System.out.println(count);
//        ArrayDeque<Integer> q=new ArrayDeque<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        q.add(40);
//        ArrayDeque<Integer> qd=new ArrayDeque<>();
//        int k=2;
//        while(qd.isEmpty() || qd.size()<k){
//            qd.addFirst(q.pollLast());
//            System.out.println(qd.size());
//        }
//        System.out.println(qd);
//        System.out.println(q);
//        while(!qd.isEmpty()){
//            q.addFirst(qd.removeLast());
//        }
//        System.out.println(q);
//        String str="A man, a plan, a canal: Panama";
//         str=str.replaceAll(" ","").replaceAll(",","").replaceAll(":","");
//         System.out.println(isPalindrome(str));
//       // isPalindrome(str);
//    }
//            public static boolean isPalindrome(String s) {
//                s=s.replaceAll(" ","").replaceAll(",","").replaceAll(":","").toLowerCase();
//                int n=s.length();
//                String str="";
//                for(int i=n-1;i>=0;i--){
//                    str+=s.charAt(i);
//                }
//                System.out.println(str);
//                return s.equals(str);
//        int[] arr={2,4,5,167,31,1};
//        PriorityQueue<Integer> pq=new PriorityQueue<>();
//      //  PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//
//         System.out.println(pq.peek());
        // HashSet -> HashMap -> Array of Nodes(key,Value)
        //int[] arr={10,29,3,0,29,13,10};

//        TreeSet<Object> hs=new TreeSet<>();
////         for(int x:arr)
////             hs.add(x);
//        hs.add(10);
//        hs.add(90);
//        hs.add(45);
//        hs.add(20);
//        hs.add(20);
//        hs.add(47);
//       System.out.println(hs.pollFirst());
//       System.out.println(hs.pollLast());
//       System.out.println(hs);
//        System.out.println(hs.subSet(15,46)); // virtual set
//        System.out.println(hs.descendingSet());
//        int arr[] = {2, 4, 5, 1, 10};
//        int ar[]={2,5,3,7,8};
//        HashSet<Integer> hs = new HashSet<>();
//        HashSet<Integer> hs1 = new HashSet<>();
//         for(int x:arr)
//             hs.add(x);
//        for(int x:ar)
//            hs1.add(x);
//          System.out.println(hs.retainAll(hs1));
//          System.out.println(hs.removeAll(hs1));
//          System.out.println(hs.addAll(hs1));
        // Write your code here
           Integer[] arr={10,70,30,780,50};
           //int k=2;
            //   LinkedList<Integer> ll=new LinkedList<>(Arrays.asList(arr));
             //  ll.addFirst(60);
               Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
