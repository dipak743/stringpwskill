public class Palindrome {
    public static void main(String[] args) {
        String s="madam";
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
           
           str=str+s.charAt(i);
        }
        if(str.equals(s))
        {
            System.out.println("palindrome");

        }
        else{
            System.out.println("not palindrome");
        }
    }
    

}
