package ArtificialIntelligence;

import DataOfGame.Data;
import static DataOfGame.Data.list;
import GameTicTacToe.Game;

public class BeginnerAI {
	static Data data = new Data();

	public static void game() {
		data.getAiEmptyPositions();
		byte pos = Data.getRandomElement(list);
		if (Game.userRole != 1) {
			Data.setXData((byte) (pos - 1));
		} else {
			Data.setOData((byte) (pos - 1));
		}
	}
}
