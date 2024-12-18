public class A2_10 {
    public static void main(String[] args) {
    int a=824,temp=0,var,b=1;

    var=a%10;
    int c=a/10;
    int copy=c;
    while(copy>0) {
        temp++;
        copy/=10;
    }
    while(temp>0)
    {
        b=b*10;
        temp--;
    }
    a=var*b+c;
        System.out.println(a);
    }
}
/**
 * By GPT
 * public class A2_10 {
 *     public static void main(String[] args) {
 *         int a = 824;
 *         int numDigits = (int) Math.log10(a) + 1;  // Calculate the number of digits
 *         int lastDigit = a % 10;  // Extract the last digit
 *         int remainingDigits = a / 10;  // Remove the last digit
 *
 *         // Calculate the rotated number
 *         int rotatedNumber = lastDigit * (int) Math.pow(10, numDigits - 1) + remainingDigits;
 *
 *         // Print the rotated number
 *         System.out.println(rotatedNumber);  // Should print 482
 *     }
 * }
 *
 *
 * */
