package Video2;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(10);//1 first value
        num.push(20);//2
        num.push(30);//3
        num.push(40);//4
        num.push(50);//5 last valuse
        System.out.println("insert in the valuse first");
        for(int a : num){
            System.out.println(a);

        }
        System.out.println("delete in the values last");
        num.pop();// last value is 50
        for(int a : num){
            System.out.println(a);

        }
    }
}
