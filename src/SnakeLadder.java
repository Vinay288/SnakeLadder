
public class SnakeLadder {
	public static void main(String[] args) {
		int player1Position = 0, player2Position = 0, player = 0;
		while (player1Position != 100 && player2Position != 100) {
			int dieNumber = 1 + (int) (Math.random() * 6);
			int playCheck = (int) (Math.random() * 3);
			if (playCheck == 0) {
				System.out.println("NO PLAY");
				player = player ^ 1;
			} else if (playCheck == 1) {
				if (player == 0) {
					System.out.println("Player 1 Move");
					player1Position += dieNumber;
				} else {
					System.out.println("Player 2 Move");
					player2Position += dieNumber;
				}
			} else {
				if (player == 0) {
					System.out.println("player1 play(snake)");
					player1Position = 0 > player1Position - dieNumber ? 0 : player1Position - dieNumber;
				} else {
					System.out.println("Player 2 play(snake)");
					player2Position = 0 > player2Position - dieNumber ? 0 : player2Position - dieNumber;
				}
				player = player ^ 1;
			}
		}
		if (player1Position == 100) {
			System.out.println("player 1 wins and position of player2 is " + player2Position);
		} else {
			System.out.println("player 2 wins and position of player1 is " + player1Position);
		}
	}
}
