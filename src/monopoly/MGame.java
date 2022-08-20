package monopoly;

public class MGame {
    private int roundCnt;
    private Die[] dice;
    private Player[] players;
    private Board board;
    private static final int N = 20;

    public MGame(int roundCnt, Die[] dice, Player[] players, Board board) {
        this.roundCnt = roundCnt;
        this.dice = dice;
        this.players = players;
        this.board = board;
    }

    public  void playGame(){
        for (roundCnt = 0; roundCnt < N; roundCnt++){
            playRound();
        }
    }

    private void playRound(){
        for (Player player : players){
            player.takeTurn();
        }
    }
}
