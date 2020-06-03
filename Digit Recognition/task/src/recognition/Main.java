package recognition;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input grid:");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> grid = new ArrayList<>();
        for (int i = 0; i <  3; i++) {
            char[] tempChar = scanner.nextLine().toCharArray();
            for (int j = 0; j < 3; j++) {
                grid.add(tempChar[j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(grid.get(i));
        }
        System.out.println();
        for (int i = 3; i < 6; i++) {
            System.out.print(grid.get(i));
        }
        System.out.println();
        for (int i = 6; i < 9; i++) {
            System.out.print(grid.get(i));
        }
        System.out.println();

        int [] ifX = new int[9];
        for (int i = 0; i < 9; i++) {
            if (grid.get(i) == 'X'){
                ifX[i] = 1;
            } else {
                ifX[i] = 0;
            }
        }

        int value = ifX[0] * 2 +
                ifX[1] * 1 +
                ifX[2] * 2 +
                ifX[3] * 4 +
                ifX[4] * (-4) +
                ifX[5] * 4 +
                ifX[6] * 2 +
                ifX[7] * (-1) +
                ifX[8] * 2 +
                (-5);

        int number = 0;
        if (value > 0) {
            number = 0;
        } else if (value < 0){
            number = 1;
        }

        System.out.println("This number is " + number);




    }
}
