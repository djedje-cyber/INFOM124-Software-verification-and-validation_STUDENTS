
public class TennisGame3 implements TennisGame {

    private int Player2;
    private  int Player1;
    private  String Player1Name;
    private String Player2Name;

    private String score;

    public TennisGame3(String Player1Name, String Player2Name) {
        this.Player1Name = Player1Name;
        this.Player2Name = Player2Name;
    }

    public String getScore() {

        if (Player1 < 4 && Player2 < 4 && !(Player1 + Player2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            this.score = p[Player1];
            return (Player1 == Player2) ? this.score + "-All" : this.score + "-" + p[Player2];
        } else {
            if (Player1 == Player2)
                return "Deuce";
            this.score = Player1 > Player2 ? Player1Name : Player2Name;
            return ((Player1 -Player2)*(Player1 -Player2) == 1) ? "Advantage " + this.score : "Win for " + this.score;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.Player1 += 1;
        else
            this.Player2 += 1;

    }

}
