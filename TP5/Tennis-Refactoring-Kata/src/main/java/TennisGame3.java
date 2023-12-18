
public class TennisGame3 implements TennisGame {

    private int Player2;
    private  int Player1;
    private  String PlayerName1;
    private String PlayerName2;


    private String score;

    public TennisGame3(String PlayerName1, String PlayerName2) {
        this.PlayerName1 = PlayerName1;
        this.PlayerName2 = PlayerName2;
    }

    public String getScore() {

        if (Player1 < 4 && Player2 < 4 && !(Player1 + Player2 == 6)) {
            String[] point = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            this.score = point[Player1];
            return (Player1 == Player2) ? this.score + "-All" : this.score + "-" + point[Player2];
        } else {
            if (Player1 == Player2)
                return "Deuce";
            this.score = Player1 > Player2 ? PlayerName1 : PlayerName2;
            return ((Player1 -Player2)*(Player1 -Player2) == 1) ? "Advantage " + this.score : "Win for " + this.score;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            this.Player1 += 1;
        }
        else{
            this.Player2 += 1;
        }
    }

}
