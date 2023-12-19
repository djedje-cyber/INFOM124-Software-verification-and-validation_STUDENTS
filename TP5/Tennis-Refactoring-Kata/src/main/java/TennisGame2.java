import tennis.game4.TennisGame;

import java.util.HashMap;
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

    public String getScore(){
        String score = "";
        if (P1point == P2point && P1point < 4)
        {
            if (P1point==0)
                score = LOVE ;
            if (P1point==1)
                score = FIFTEEN;
            if (P1point==2)
                score = THIRTY;
            score += "-All";
        }
        if (P1point==P2point && P1point>=3)
            score = "Tennis.Game4.ResultProvider.Deuce";

        if (P1point > 0 && P2point==0)
        {
            if (P1point==1)
                P1res = FIFTEEN;
            if (P1point==2)
                P1res = THIRTY;
            if (P1point==3)
                P1res = FORTY;

            P2res = LOVE;
            score = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point==0)
        {
            if (P2point==1)
                P2res = FIFTEEN;
            if (P2point==2)
                P2res = THIRTY;
            if (P2point==3)
                P2res = FORTY;

            P1res = LOVE;
            score = P1res + "-" + P2res;
        }

        if (P1point>P2point && P1point < 4)
        {
            if (P1point==2)
                P1res=THIRTY;
            if (P1point==3)
                P1res=FORTY;
            if (P2point==1)
                P2res=FIFTEEN;
            if (P2point==2)
                P2res=THIRTY;
            score = P1res + "-" + P2res;
        }
        if (P2point>P1point && P2point < 4)
        {
            if (P2point==2)
                P2res=THIRTY;
            if (P2point==3)
                P2res=FORTY;
            if (P1point==1)
                P1res=FIFTEEN;
            if (P1point==2)
                P1res=THIRTY;
            score = P1res + "-" + P2res;
        }

        if (P1point > P2point && P2point >= 3)
        {
            score = "Advantage player1";
        }

        if (P2point > P1point && P1point >= 3)
        {
            score = "Advantage player2";
        }

        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "Win for player1";
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }





    public void wonPoint(String player) {
        if (player.equals("player1"))
            P1point++;
        else
            P2point++;
    }
}