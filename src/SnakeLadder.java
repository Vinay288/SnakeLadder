
public class SnakeLadder {
	public static void main(String[] args) {
		int player1_position = 0, player2_position = 0, player = 0;
		while (player1_position != 100 && player2_position != 100) {
			int die_number = 1 + (int) (Math.random() * 6);
			int play_check = (int) (Math.random() * 3);
			if (play_check == 0) {
				System.out.println("NO PLAY");
				player = player ^ 1;
			} else if (play_check == 1) {
				if (player == 0) {
					System.out.println("Player 1 Move");
					player1_position += die_number;
				} else {
					System.out.println("Player 2 Move");
					player2_position += die_number;
				}
			} else {
				if (player == 0) {
					System.out.println("player1 play(snake)");
					player1_position = 0 > player1_position - die_number ? 0 : player1_position - die_number;
				} else {
					System.out.println("Player 2 play(snake)");
					player2_position = 0 > player2_position - die_number ? 0 : player2_position - die_number;
				}
				player = player ^ 1;
			}
		}
		if (player1_position == 100) {
			System.out.println("player 1 wins and position of player2 is " + player2_position);
		} else {
			System.out.println("player 2 wins and position of player1 is " + player1_position);
		}
	}
}
