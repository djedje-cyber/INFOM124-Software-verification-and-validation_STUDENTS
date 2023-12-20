import tennis.game4.TennisGame;

public class TennisGame3 implements TennisGame {

    private int player2;
    private  int player1;
    private  String playerName1;
    private String playerName2;



    public TennisGame3(String playerName1, String playerName2) {
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
    }

    public String getScore() {

        String score;

        if (player1 < 4 && player2 < 4 && (player1 + player2 != 6)) {
            String[] point = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = point[player1];
            return (player1 == player2) ? score + "-All" : score + "-" + point[player2];
        } else {
            if (player1 == player2)
                return "Tennis.Game4.ResultProvider.Deuce";
            score = player1 > player2 ? playerName1 : playerName2;
            return ((player1 - player2)*(player1 - player2) == 1) ? "Advantage " + score : "Win for " + score;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            this.player1 += 1;
        }
        else{
            this.player2 += 1;
        }
    }


    public String getNamePlayer1(){
        return this.playerName1;
    }

    public String getPlayerName2(){
        return this.playerName2;
    }




}
