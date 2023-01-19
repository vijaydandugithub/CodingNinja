package Video2;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Car"); // head
        list.add("Bike");
        list.add("Jeep");
        list.add("Sumo"); //
      /*  for(String name:list){
            System.out.println(name);
        }*/
     //   list.forEach(System.out::println);
        list.forEach(name -> System.out.println(name));


    }
}
