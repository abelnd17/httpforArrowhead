
import java.util.ArrayList;
import java.util.List;

public class Step {

    public Step(String metadata, String name, String parameters, Integer quantity, String serviceName){
        this.metadata=metadata;
        this.name=name;
        this.parameters=parameters;
        this.quantity=quantity;
        this.serviceName=serviceName;
        nextStepNames=new ArrayList<>();
    }

    public String metadata;
    public String name;
    public List<String> nextStepNames;
    public String parameters;
    public Integer quantity;
    public String serviceName;
}
