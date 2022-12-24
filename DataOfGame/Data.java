package DataOfGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import GameTicTacToe.Game;

public class Data {
    public static List<Byte> list;
    public static byte[][] token = { { 3, 3, 3 }, { 3, 3, 3 }, { 3, 3, 3 } };
    public static byte[] board = { 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    public static int getUserRole = Game.userRole;

    public static void setXData(byte n) {
        board[n] = 1;
    }

    public static void setOData(byte n) {
        board[n] = 0;
    }

    public void getUserEmptyPositions() {
        list = new ArrayList<Byte>();
        for (byte count = 0; count < 9; count++)
            if (board[count] == 3) {
                list.add((byte) (count + 1));
                System.out.print(count + 1 + "\t");
            }
        System.out.println();
    }

    public void getAiEmptyPositions() {
        list = new ArrayList<Byte>();
        for (byte count = 0; count < 9; count++)
            if (board[count] == 3)
                list.add((byte) (count + 1));
        System.out.println();
    }

    public static boolean won() {
        if (board[0] == getUserRole) {
            if (board[1] == getUserRole)
                if (board[2] == getUserRole)
                    return true;
            if (board[3] == getUserRole)
                if (board[6] == getUserRole)
                    return true;
            if (board[4] == getUserRole)
                if (board[8] == getUserRole)
                    return true;
        }

        if (token[0][0] == token[0][1] && token[0][1] == token[0][2] && token[0][2] == Game.userRole)
            return true;
        else if (token[1][0] == token[1][1] && token[1][1] == token[1][2] && token[1][2] == Game.userRole)
            return true;
        else if (token[2][0] == token[2][1] && token[2][1] == token[2][2] && token[2][2] == Game.userRole)
            return true;
        else if (token[0][0] == token[1][0] && token[1][0] == token[2][0] && token[2][0] == Game.userRole)
            return true;
        else if (token[0][1] == token[1][1] && token[1][1] == token[2][1] && token[2][1] == Game.userRole)
            return true;
        else if (token[0][2] == token[1][2] && token[1][2] == token[2][2] && token[2][2] == Game.userRole)
            return true;
        else if (token[0][0] == token[1][1] && token[1][1] == token[2][2] && token[2][2] == Game.userRole)
            return true;
        else if (token[0][2] == token[1][1] && token[1][1] == token[2][0] && token[2][0] == Game.userRole)
            return true;
        else
            return false;
    }

    public static boolean lose() {
        if (token[0][0] == token[0][1] && token[0][1] == token[0][2] && token[0][2] == Game.aiRole)
            return true;
        else if (token[1][0] == token[1][1] && token[1][1] == token[1][2] && token[1][2] == Game.aiRole)
            return true;
        else if (token[2][0] == token[2][1] && token[2][1] == token[2][2] && token[2][2] == Game.aiRole)
            return true;
        else if (token[0][0] == token[1][0] && token[1][0] == token[2][0] && token[2][0] == Game.aiRole)
            return true;
        else if (token[0][1] == token[1][1] && token[1][1] == token[2][1] && token[2][1] == Game.aiRole)
            return true;
        else if (token[0][2] == token[1][2] && token[1][2] == token[2][2] && token[2][2] == Game.aiRole)
            return true;
        else if (token[0][0] == token[1][1] && token[1][1] == token[2][2] && token[2][2] == Game.aiRole)
            return true;
        else if (token[0][2] == token[1][1] && token[1][1] == token[2][0] && token[2][0] == Game.aiRole)
            return true;
        else
            return false;
    }

    public static void displayTicTacToe() {
        System.out.println("\r\n");
        for (byte count = 0; count <= 5; count += 1) {
            if (count % 2 == 0)
                System.out.print("--- --- ---");
            else {
                System.out.print(" ");
                for (byte counter = 0; counter < 5; counter += 1)
                    System.out.print(((counter % 2 == 0)
                            ? ((board[count / 2 * 3 + counter / 2] == 1) ? "X"
                                    : ((board[count / 2 * 3 + counter / 2] == 0) ? "O" : count / 2 * 3 + counter / 2))
                            : " | "));
            }
            System.out.println();
        }
    }

    public static byte getRandomElement(List<Byte> list2) {
        Random rand = new Random();
        return list2.get(rand.nextInt(list2.size()));
    }
}
