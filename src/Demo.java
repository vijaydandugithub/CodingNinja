import java.util.*;
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Number : ");
       int n = sc.nextInt();


        for (int i = 0; i<=n; i++){
            if (i%2==1){
                i++;
            }
        }


        System.out.println(n);
    }
}