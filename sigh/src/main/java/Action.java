

import java.util.ArrayList;
import java.util.List;

public class Action {

    public Action(String name, String nextAction){
        firstStepNames= new ArrayList<>();
        this.name = name;
        nextActionName = nextAction;
        steps = new ArrayList<>();
    }

    public List<String> firstStepNames;
    public String name;
    public String nextActionName;
    public List<Step> steps;
}
