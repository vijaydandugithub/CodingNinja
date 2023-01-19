package Video2;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println("first value is 10");
        for (int a : que) {
            System.out.println(a);

        }
        System.out.println("delete the first value is 10");
        que.remove();  //10
        /*for(int a : que){
            System.out.println(a);
        }*/
        que.forEach(System.out::println);

    }
}
