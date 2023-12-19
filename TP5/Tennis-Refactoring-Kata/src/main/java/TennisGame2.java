import tennis.game4.TennisGame;

public class TennisGame2 implements TennisGame
{
    public int P1point = 0;
    public int P2point = 0;

    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    private static final String FIFTEEN = "Fifteen";
    private static final String LOVE = "Love";

    private static final String THIRTY = "Thirty";

    private static final String FORTY="Forty";
    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;




    }

    public String getScore() {
        if (P1point == P2point) {
            return getEqualScore();
        } else if (P1point >= 4 || P2point >= 4) {
            return getEndGameScore();
        } else {
            return getRegularScore();
        }
    }

    private String getEqualScore() {
        if (P1point < 3) {
            return (P1point == 0) ? LOVE + "-All" : getPointScore(P1point) + "-All";
        } else {
            return "Tennis.Game4.ResultProvider.Deuce";
        }
    }

    private String getRegularScore() {
        String P1res = getPointScore(P1point);
        String P2res = getPointScore(P2point);
        return P1res + "-" + P2res;
    }

    private String getEndGameScore() {
        if (Math.abs(P1point - P2point) >= 2) {
            return (P1point > P2point) ? "Win for player1" : "Win for player2";
        } else {
            return (P1point > P2point) ? "Advantage player1" : "Advantage player2";
        }
    }

    private String getPointScore(int point) {
        switch (point) {
            case 1:
                return FIFTEEN;
            case 2:
                return THIRTY;
            case 3:
                return FORTY;
            default:
                return LOVE;
        }
    }






    public void wonPoint(String player) {
        if (player.equals("player1"))
            P1point++;
        else
            P2point++;
    }
}