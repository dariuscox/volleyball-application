/**
 * Created by DSYancarlos on 11/24/2016.
 */
public class StatsSheet {

    private Integer Digs;
    private Integer Assits;
    private Integer Kills;
    private Integer Aces;
    private Integer Blocks;

    @Override
    public String toString(){
        String Sheet;
        Sheet = "Digs: " + this.Digs.toString() + "\n";
        Sheet = "Assists: " + this.Assits.toString() + "\n";
        Sheet = "Kills: " + this.Kills.toString() + "\n";
        Sheet = "Aces: " + this.Aces.toString() + "\n";
        Sheet = "Blocks: " + this.Blocks.toString() + "\n";
        return Sheet;
    }
}
