import java.util.Scanner;


class AreaCircle{
    public static void main(String[] args)
{
    Scanner sc = new Scanner (System.in);
    int s = sc.nextInt("enter a no.");
   
    if(s%2==0 ){
        System.out.println(s+"is even no.");
}
    else{System.out.println(s+"is odd no.");
}   
    sc.close();

}}