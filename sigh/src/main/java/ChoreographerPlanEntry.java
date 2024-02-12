
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class ChoreographerPlanEntry {

    public ChoreographerPlanEntry(String actionName, String name){
        firstActionName = actionName;
        this.name = name;
        actions = new ArrayList<>();
    }

    @Getter
    public List<Action> actions;
    public String firstActionName;
    public String name;
}
