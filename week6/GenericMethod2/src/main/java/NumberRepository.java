import java.util.ArrayList;
import java.util.List;

public class NumberRepository {
    private List<Number> data = new ArrayList<>();
    private static NumberRepository instance = new NumberRepository();

    public static NumberRepository getInstance() {
        return instance;
    }

    //implement addAll() method

    public String toString(){
        return data.toString();
    }

    public <T> void addAll(List<? extends Number> intData) {
        for(Number d : intData){
            this.data.add(d);
        }
    }
}