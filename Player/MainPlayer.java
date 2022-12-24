package Player;

import java.util.Scanner;

import DataOfGame.Data;
import static DataOfGame.Data.list;
import GameTicTacToe.Game;

public class MainPlayer {
    static Scanner scanner = new Scanner(System.in);

	static Data data = new Data();

	public static void game() {
		data.getUserEmptyPositions();
		System.out.println("\r\nEnter Position:\n");
		boolean isNotValid = true;
		while (isNotValid) {
			if (scanner.hasNextByte()) {
				byte pos = scanner.nextByte();
				if (list.contains(pos)) {
					if (Game.userRole == 1) {
						Data.setXData((byte) (pos - 1));
					} else {
						Data.setOData((byte) (pos - 1));
					}
					isNotValid = false;
				} else {
					System.out.println("Please enter specified position!\n");
				}
			} else {
				System.out.println("Please enter specified position!\n");
			}
			scanner.nextLine();
		}
	}
}
