public class Main {

    static boolean IsPalindrome(int number){
        int temp=number, reverseNumber=0, lastNumber;

        while(temp !=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        return reverseNumber == number;
    }
    public static void main(String[] args) {

        System.out.println(IsPalindrome(141));
    }
}