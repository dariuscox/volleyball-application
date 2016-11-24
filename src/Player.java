/**
 * THE Player, man.
 */
public class Player {
    private String name;
    private Integer number;
    private String position;
    private StatsSheet stats;
    private Boolean onCourt;

    Player(String name, int num){
        this.name = name;
        this.number = num;
        this.stats = new StatsSheet();
        onCourt = false;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getstats(){
        return stats.toString();
    }

    public boolean isOnCourt(){return onCourt;}

    public void putOnCourt(){onCourt = true;}

    public void takeOffCourt(){onCourt = false;}

    public void setPosition(String position) {
        this.position = position;
    }

    public void addStat(String stat){
        if (isOnCourt()) {
            if (stat.equals("k")) {
                stats.killAdd();
            } else if (stat.equals("s")) {
                stats.assistAdd();
            } else if (stat.equals("d")) {
                stats.digAdd();
            } else if (stat.equals("a")) {
                stats.aceAdd();
            } else if (stat.equals("b")) {
                stats.blockAdd();
            }
        }
        else{
            System.out.println("Player not on court");
        }

    }

    public String toString() {
        return "Player{" + "name='" + name + '\'' + ", number=" + number + '}';
    }
}
