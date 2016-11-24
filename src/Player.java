/**
 * THE Player, man.
 */
public class Player {
    private String name;
    private Integer number;
    private String position;
    private StatsSheet stats;
    Player(String name, int num){
        this.name = name;
        this.number = num;
        this.stats = new StatsSheet();
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

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return "Player{" + "name='" + name + '\'' + ", number=" + number + '}';
    }
}
