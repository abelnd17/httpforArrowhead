

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class JSONConverter {

    public static String convert(String serviceName, Integer quantity) throws JsonProcessingException {

        ChoreographerPlanEntry entry = new ChoreographerPlanEntry("sayhello", "welcome");
        Action action = new Action("sayhello", null);
        action.firstStepNames.add("dothehellothing");
        Step step = new Step(null,"dothehellothing",null, quantity,serviceName);
        action.steps.add(step);
        entry.getActions().add(action);
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(entry);
        return json;
    }
}
