/**
 * THE Team
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Team {

    private String teamName;

    private HashMap<String,Player> Roster;

    private Integer wins;

    private Integer loses;

    public void printRecord(){
        System.out.println("Win: " +wins+ " / Lose: " +loses);
    }
}
