/**
 * Created by ddcga on 11/24/2016.
 */
public class Match {
    private Integer sets;
    private Team t1;
    private Team t2;
    private Integer currentSet;
    private Boolean winByTwo = false;
    private Integer duecePt = 24;
    Match(Team t1,Team t2, Integer sets){
        this.t1 = t1;
        this.t2 = t2;
        this.sets = sets;
        this.currentSet = 1;
    }
    public void awardPoint(String px) {
        if (px.equals("1")) {
            t1.pointAdd();
        } else if (px.equals("2")) {
            t2.pointAdd();
        }
        score();
        if ((t1.getPoints().equals( duecePt)) && (t2.getPoints().equals(duecePt))){
            winByTwo = true;
        }
        if (currentSet.equals(sets)){
            duecePt = 14;
        }
        if (winByTwo.equals(false)) {
            if (!currentSet.equals(sets)) {
                if (t1.getPoints() == 25) {
                    //score();
                    System.out.println(t1.getTeamName() + " wins set: " + currentSet);
                    t1.setAdd();
                    currentSet += 1;
                    switchSides();
                } else if (t2.getPoints() == 25) {
                   // score();
                    System.out.println(t2.getTeamName() + " wins set: " + currentSet);
                    t2.setAdd();
                    currentSet += 1;
                    switchSides();
                }
            } else if (currentSet.equals(sets)) {
                    if (t1.getPoints() == 15) {
                        System.out.println(t1.getTeamName() + " wins set: " + currentSet);
                        t1.setAdd();

                    } else if (t2.getPoints() == 15) {
                        System.out.println(t2.getTeamName() + " wins set: " + currentSet);
                        t2.setAdd();

                    }
            }
        }
        else if (winByTwo.equals(true)){
            if(t1.getPoints() - t2.getPoints() == 2){
                System.out.println(t1.getTeamName() + " wins set: " +currentSet);
                t1.setAdd();
                currentSet += 1;
                switchSides();
            }
            else if(t2.getPoints() - t1.getPoints() == 2){
                System.out.println(t2.getTeamName() + " wins set: " +currentSet);
                t2.setAdd();
                currentSet += 1;
                switchSides();
            }
        }
    }

    public void removePoint(String px){
        if (px.equals("p1")) {
            t1.pointRemove();
        } else if (px.equals("p2")) {
            t2.pointRemove();
        }
    }
    public void start(){
        t1.setPoints(0);
        t2.setPoints(0);
        System.out.println("Starting Match.");
    }
    public void score(){
        System.out.println(t1.getTeamName() + ": " + t1.getPoints() + " - " + t2.getTeamName() + ": " + t2.getPoints());
    }
    public void switchSides(){
        System.out.println("Switching sides.");
        t1.setPoints(0);
        t2.setPoints(0);
    }

}
