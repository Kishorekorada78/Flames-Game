public class vowelsCount {
    public static void main(String[] args) {
        String str="Kishore";
        char[] ch=str.toCharArray();
        int vowels=0,cons=0;
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
                vowels++;
            else
                cons++;
        }
        System.out.println(vowels);
        System.out.println(cons);
    }
}
