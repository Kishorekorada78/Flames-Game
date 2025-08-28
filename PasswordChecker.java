public class PasswordChecker {
    public static void main(String[] args) {
        String str="kBB_8gg@ ";
        if(valid(str))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
    public static boolean valid(String str) {
        int length = str.length();
        boolean digit;
        boolean upper;
        boolean special;
       // boolean sps;
        if (length < 4 || Character.isDigit(str.charAt(0)))
            return false;
        else {
            // char[] str1=str.toCharArray();
            upper = false;
            digit = false;
            special = false;
            //sps=false;
            for (char ch : str.toCharArray()) {
                if (Character.isUpperCase(ch))
                    upper = true;
                else if (Character.isDigit(ch))
                    digit = true;
                else if(ch==32 || ch==47)
                    return false;
                else if (Character.isLetterOrDigit(ch))
                    special = true;

            }
        }

        return upper && digit && special;
    }
}
