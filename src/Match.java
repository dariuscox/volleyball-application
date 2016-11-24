/**
 * Created by ddcga on 11/24/2016.
 */
public class Match {
    private Integer sets;
    private Team t1;
    private Team t2;
    Match(Team t1,Team t2, Integer sets){
        this.t1 = t1;
        this.t2 = t2;
        this.sets = sets;
    }
    public void awardPoint(String px) {
        if (px.equals("p1")) {
            t1.pointAdd();
        } else if (px.equals("p2")) {
            t2.pointAdd();
        }
        if (t1.getPoints() == 25) {
            System.out.println(t1.getTeamName() + " wins");
            t1.setAdd();
        }
        else if (t2.getPoints() == 25){
            System.out.println(t2.getTeamName() + " wins");
            t2.setAdd();
        }
    }
}
