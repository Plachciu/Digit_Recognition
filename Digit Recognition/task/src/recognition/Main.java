package recognition;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Map<Integer,Integer> bias = new HashMap<>();
//        bias.put(0,-1);
//        bias.put(1,6);
//        bias.put(2,1);
//        bias.put(3,0);
//        bias.put(4,2);
//        bias.put(5,0);
//        bias.put(6,-1);
//        bias.put(7,3);
//        bias.put(8,-2);
//        bias.put(9,0);

        System.out.println("Input grid:");
        Recognizer digit = new Recognizer();

        digit.gridReader();

        digit.gridWriter();

        digit.digitRecognizer();





    }
}
