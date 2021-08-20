
public class SnakeLadder {
	public static void main(String [] args) {
		int player1_position = 0;
		int die_number = 1 + (int) (Math.random() * 6);
		int play_check = (int)(Math.random()*3);
		if(play_check==0)
			System.out.println("NO PLAY");
		else if(play_check == 1) {
			System.out.println("Player Move");
			player1_position+=die_number;
		}
		else {
			System.out.println("Snake play");
			player1_position=0>player1_position-die_number?0:player1_position-die_number;
		}
		System.out.println("Player's position is "+player1_position);
	}

}
