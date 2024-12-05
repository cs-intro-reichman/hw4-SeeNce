public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
     String newStr = "";
     for(int i=0; i<str.length(); i++)
     {
        if(str.charAt(i)<='Z' && str.charAt(i)>='A')
            newStr += (char)(str.charAt(i)+32);
            else newStr += str.charAt(i);
     }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.isEmpty()) {
            return true;
        }
        if(str1.length()<str2.length())
            return false;
        int c=0;

        for(int i=0; i<str1.length(); i++){
            int cs=0;
            for(int j=0;j<str2.length(); j++)
            {
                if ((j + c) >= str1.length() || str1.charAt(j + c) != str2.charAt(j))
                    break;

                cs++;
                if(cs==str2.length())
                    return true;
            }
            c++;
        }
        return false;
    }
}
