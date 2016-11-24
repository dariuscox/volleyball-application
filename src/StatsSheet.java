/**
 * Created by DSYancarlos on 11/24/2016.
 */
public class StatsSheet {

    private Integer Digs;
    private Integer Assits;
    private Integer Kills;
    private Integer Aces;
    private Integer Blocks;


    public StatsSheet(){
        this.Digs = 0;
        this.Assits = 0;
        this.Kills = 0;
        this.Aces = 0;
        this.Blocks = 0;
    }

    public Integer getDigs(){
        return this.Digs;
    }

    public Integer getAssits(){
        return this.Assits;
    }

    public Integer getKills(){
        return this.Kills;
    }

    public Integer getAces(){
        return this.Aces;
    }

    public Integer getBlock(){
        return this.Blocks;
    }

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
