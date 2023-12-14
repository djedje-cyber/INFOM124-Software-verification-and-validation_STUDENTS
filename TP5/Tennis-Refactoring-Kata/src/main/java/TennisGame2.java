
public class TennisGame2 implements TennisGame
{
    public int P1point = 0;
    public int P2point = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }


    /**
    public String getScore() {
        String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};

        if (P1point == P2point) {
            if (P1point < 4) {
                return (P1point == 0) ? scoreNames[0] + "-All" : scoreNames[P1point] + "-All";
            } else {
                return "Deuce";
            }
        }

        if ((P1point > 0 && P2point == 0) || (P2point > 0 && P1point == 0)) {
            return scoreNames[P1point] + "-" + scoreNames[P2point];
        }

        if ((P1point > P2point && P1point < 4) || (P2point > P1point && P2point < 4)) {
            return scoreNames[P1point] + "-" + scoreNames[P2point];
        }

        if (Math.abs(P1point - P2point) >= 2) {
            return (P1point > P2point) ? "Win for player1" : "Win for player2";
        }

        return (P1point > P2point) ? "Advantage player1" : "Advantage player2";
    }
**/

    public String getScore() {
        return "";
    }

    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        P1point++;
    }
    
    public void P2Score(){
        P2point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}