public class ReverseString {
    // REVERSE STRING AND CHECK IS IT PALINDROME OR NOT

    public static void main(String[] args) {
        String s= "madam  ";
        String n="";

        for(int i = s.length()-1; i>=0; i--){

            n = n + s.charAt(i);
        }
        System.out.println(n);

        if(s.equals(n)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is NOT Palindrome ");
        }
    }
}
