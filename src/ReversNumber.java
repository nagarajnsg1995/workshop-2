import java.util.ArrayList;
import java.util.Collections;

public class ReversNumber {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(0,10);
        num.add(1,50);
        num.add(2,30);
        System.out.println("before revers arraylist");
        System.out.println(num);
        Collections.reverse(num);
        System.out.println("after revers arraylist");
        System.out.println(num);


        }
    }

