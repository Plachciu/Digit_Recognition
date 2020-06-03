package recognition;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input grid:");
        Recognizer digit = new Recognizer();

        digit.gridReader();

        digit.gridWriter();

        digit.digitRecognizer();

    }
}
