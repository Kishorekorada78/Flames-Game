public class panagram {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        if(panagram(s))
            System.out.println("Panagram");
        else
            System.out.println("Not");
    }
    public static boolean panagram(String s){
        int n=s.length();
        if(n<26)
            return false;
        boolean[] bol=new boolean[26];
        for(int i=0;i<n;i++)
        {
            char x=s.charAt(i);
            if(x>='a' && x<='z')
                bol[x-'a']=true;
            if(x>='A' && x<='Z')
                bol[x-'A']=true;
        }
        for(int i=0;i<26;i++)
        {
            if(bol[i]==false)
                return false;
        }
        return true;

    }
}
