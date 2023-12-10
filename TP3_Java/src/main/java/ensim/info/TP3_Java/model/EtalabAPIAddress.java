package ensim.info.TP3_Java.model;

import java.util.ArrayList;
import java.util.List;


public class EtalabAPIAddress {
    public List<Feature> features = new ArrayList<>();

    @Override
    public String toString() {
        return "EtalabAPIAddress{" +
                "features=" + features +
                '}';
    }
}
