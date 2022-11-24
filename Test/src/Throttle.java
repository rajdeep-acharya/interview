/*
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Throttle implements GetAvailableNode {
    Map<String, TreeMap<String, AtomicInteger>> map = new ConcurrentHashMap<>();



    @Override
    public List<String> getAllNode() {
        return null;
    }

    @Override
    public List<String> getAliveNodes(String URI) {
        URI - hostname
//        return null;
        RestTemplate service = RestTemplate.getForObject(uriFor(hostname).addUri("/health").post());
        List<Health> healthList = service.readEnity(Enitity.json());
    }


    a@
    [a-z][A-Z][0-9]{@}[]{\.}
    a@


}
*/
