public class palindrome {
    public boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

    public static void main(String[] args) {
        palindrome check = new palindrome();
        if(check.isPalindrome("thing")){
            System.out.println("Given word is palindrome");
        }
        else{
            System.out.println("Given word is not palindrome");
        }
    }
}
