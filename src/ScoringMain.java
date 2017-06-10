import java.util.Scanner;
import java.util.Stack;

/**
 * Created by danielcox on 4/24/17.
 */
public class ScoringMain {

    public static void main(String[] args) {
        Stack<String> undo = new Stack<>();
        Team t1 =  new Team("Home");
        Team t2 = new Team("Away");
        Match M = new Match(t1,t2,1);
        Integer gameTo;
        Scanner scan  = new Scanner(System.in);
        M.start();
        boolean over = false;
        while (!over){
            String in = scan.nextLine();
            if (in.equals("end")) {
                over = true;
            }
            else if (in.equals("undo") && !undo.empty()){
                M.removePoint(undo.pop());
                M.score();
            }
            else{
                M.awardPoint(in);
                undo.push(in);
                M.score();
            }
        }
        System.out.println("we made something work");
    }

}
