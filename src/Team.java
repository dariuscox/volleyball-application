/**
 * THE Team
 */

import javax.xml.soap.SOAPPart;
import java.util.ArrayList;
import java.util.HashMap;

public class Team {

    private String teamName;

    private HashMap<String,Player> Roster;

    private Integer wins;

    private Integer loses;

    private Integer points;

    private Integer sets;

    Team(String name){
        this.teamName = name;
        this.Roster = new HashMap<>();
        this.wins = 0;
        this.loses = 0;
        this.points = 0;
        this.sets = 0;
    }
    public void printRecord(){
        System.out.println("Win: " +wins+ " / Lose: " +loses);
    }
    public void addPlayer(Player p){
        if (!Roster.containsKey(p.getName())){
        Roster.put(p.getName(),p);
        }
    }
    public void pointAdd(){
        points ++;
    }
    public void pointRemove(){points --;}
    public void setAdd(){
        sets++;
    }
    public void winAdd(){
        wins++;
    }
    public void lossAdd(){
        loses++;
    }

    public String getTeamName() {
        return teamName;
    }

    public Integer getWins() {
        return wins;
    }

    public Integer getLoses() {
        return loses;
    }

    public Integer getPoints() {
        return points;
    }

    public Integer getSets() {
        return sets;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String toString(){
        String string = "";
        string += teamName + "\n";
        for(Player player: Roster.values()){
            string += player + "\n";
        }
        return string;
    }

    public static void main(String[] args){
        Team team1 = new Team("RIT Scrub Squad");
        Player player1 = new Player("Daniel Cox", 8);
        Player player2 = new Player("Yancarlos Diaz", 1);
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        System.out.print(team1);
        Team team2 = new Team("RIT A Team");
        Player player3 = new Player("Chris Pooploski", 5);
        Player player4 = new Player("Eric Deal", 4);
        team2.addPlayer(player3);
        team2.addPlayer(player4);
        System.out.print(team2);
    }
}
