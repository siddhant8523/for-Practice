public class A2_10 {
    public static void main(String[] args) {
    int a=824;
    int temp=0;
    int var;
    int b=1;
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
