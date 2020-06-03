package recognition;

import java.util.ArrayList;
import java.util.Scanner;

public class Recognizer {

    public ArrayList<Character> grid = new ArrayList<>();

    public Recognizer () {

    }

    public void gridReader () {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <  3; i++) {
            char[] tempChar = scanner.nextLine().toCharArray();
            for (int j = 0; j < 3; j++) {
                this.grid.add(tempChar[j]);
            }
        }
    }



}
