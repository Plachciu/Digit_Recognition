package recognition;

import java.util.ArrayList;

import java.util.Scanner;

public class Recognizer {

    public ArrayList<Character> grid = new ArrayList<>();

    public Recognizer () {

    }

    public void gridReader () {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <  5; i++) {
            char[] tempChar = scanner.nextLine().toCharArray();
            for (int j = 0; j < 3; j++) {
                this.grid.add(tempChar[j]);
            }
        }
    }

    public void gridWriter () {

        for (int i = 0; i < 15; i += 3) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.grid.get(i + j));
            }
            System.out.println();
        }

    }


    public void digitRecognizer () {

        int [] valueGrid = new int[15];
        int c = 0;
        for (char temp : grid) {
            if (temp == 'X'){
                valueGrid[c] = 1;
                c++;
            } else {
                valueGrid[c] = -1;
                c++;
            }
        }

        int [] ifX = new int[15];
        int x = 0;
        for (char temp : grid) {
            if (temp == 'X'){
                ifX[x] = 1;
                x++;
            } else {
                ifX[x] = 0;
                x++;
            }
        }


        int value = 0;
        for (int i = 0; i < grid.size(); i++){
            value += valueGrid[i] + ifX[i];
        }
//        spróbować dokończyć na enumach!























//        int [] ifX = new int[9];
//        for (int i = 0; i < 9; i++) {
//            if (this.grid.get(i) == 'X'){
//                ifX[i] = 1;
//            } else {
//                ifX[i] = 0;
//            }
//        }
//
//        int value = ifX[0] * 2 +
//                ifX[1] * 1 +
//                ifX[2] * 2 +
//                ifX[3] * 4 +
//                ifX[4] * (-4) +
//                ifX[5] * 4 +
//                ifX[6] * 2 +
//                ifX[7] * (-1) +
//                ifX[8] * 2 +
//                (-5);
//
//        int number = 0;
//        if (value > 0) {
//            number = 0;
//        } else if (value < 0){
//            number = 1;
//        }
//
//        System.out.println("This number is " + number);

    }



}
