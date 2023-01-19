package Video2;

import java.util.HashMap;

public class hasmap {
    public static void main(String[] args) {
        HashMap<Integer,String> student = new HashMap<>();

         student.put(1,"vijay");
         student.put(2,"madhu");
         student.put(3,"suresh");
         student.put(4,"ias");
         student.put(1,"ajay");
        System.out.println(student.get(1));

    }
}
