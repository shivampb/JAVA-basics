package Strings;

public class StrMain { // Strings methods
    public static void main(String[] args) {
        String str0 = "Shivam Bhardwaj";
        String str1 = " PremShanker";

        // FINDING LENGTH METHOD
        int length = str0.length();
        System.out.println("length of your " + str0 + " string is --- " + length);
        System.out.println("--------------------------------------------------");

        // CONCATED METHOD
        String Concate = str0.concat(str1);
        System.out.println("concated String is --- " + Concate);
        System.out.println("--------------------------------------------------");

        // Sub String metods
        String SubStrings = str1.substring(1, 5);// index starts with 0
        System.out.println("Your SUBSTRING is --- " + SubStrings);
        System.out.println("--------------------------------------------------");
    }
}