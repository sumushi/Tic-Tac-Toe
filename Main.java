package tictactoe;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String input = scan.nextLine();
        System.out.println();
        String[] inp = input.split("");
         System.out.println("---------");
        System.out.println("| " + inp[0] + " " + inp[1] + " " + inp[2] + " |");
        System.out.println("| " + inp[3] + " " + inp[4] + " " + inp[5] + " |");
        System.out.println("| " + inp[6] + " " + inp[7] + " " + inp[8] + " |");
        System.out.println("---------");
        int value = 0;
        String[][] ticTacToe = new  String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ticTacToe[i][j] = inp[value];
                value++;
            }
        }

        boolean t1 = false;
        boolean t2 = false;
        boolean correctCoord = false;
        while (!correctCoord) {
            System.out.println("Enter the coordinates: ");
            String[] coord = scan.nextLine().split(" ");
            try {

                int coordX = Integer.parseInt(coord[0]);
                int coordY = Integer.parseInt(coord[1]);

                if (coordX >= 1 && coordX <= 3) {
                    t1 = true;
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                    t1 = false;
                    continue;
                }
                if (coordY >= 1 && coordY <= 3) {
                    t2 = true;
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                    t2 = false;
                }
                if (t1 && t2) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (coordX - 1 + i - j == i && coordY - 3 + i + j == j) {
                                if (ticTacToe[i][j].equals("_")) {
                                    ticTacToe[i][j] = "X";
                                    correctCoord = true;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    correctCoord = false;
                                }
                            }
                        }
                    }
                } else {
                    correctCoord = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
                correctCoord = false;
            }


        }

        System.out.println("---------");
        for (String[] s : ticTacToe) {
            System.out.print("| ");
            for (String p : s) {
                System.out.print(p);
                System.out.print(" ");

            }
            System.out.println(" |");

        }
        System.out.println("---------");



       /* int x = 0;
        int o = 0;
        int dash = 0;
        for (String s : inp) {
            if (s.equals("X")) {
                x++;
            } else if (s.equals("O")) {
                o++;
            } else {
                dash++;
            }
        }

        if (Math.abs(x - o) >= 2) {
            System.out.println("Impossible");
            return;
        }
        int i = 0;
        int count = 0;
        String win = "";
        while (i < 9) {
            if (inp[i].equals(inp[i + 1]) && inp[i].equals(inp[i + 2])) {
                count++;
                win = inp[i];

            }
            i += 3;
        }
        i = 0;

        while (i < 3) {
            if (inp[i].equals(inp[i + 3]) && inp[i].equals(inp[i + 6])) {
                count++;
                win = inp[i];
            }
            i++;
        }
        if (inp[0].equals(inp[4]) && inp[0].equals(inp[8])) {
            count++;
            win = inp[0];
        }
        if (inp[2].equals(inp[4]) && inp[2].equals(inp[6])) {
            count++;
            win = inp[2];
        }
        if (count == 1) {
            System.out.println(win + " wins");
            return;
        }
        if (count > 1) {
            System.out.println("Impossible");
        }
        if (count == 0) {
            if (dash == 0) {
                System.out.println("Draw");
            } else {
                System.out.println("Game not finished");
            }
        }*/
    }
}

