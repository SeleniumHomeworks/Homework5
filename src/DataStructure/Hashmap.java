package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<String, String> locations = new HashMap<>();
        locations.put("Dominican Republic", "Santo domigno");
        locations.put("Florida", "Miami");
        locations.put("Florida", "Tampa");
        locations.put("Puerto Rico", "San Juan");


        for (Map.Entry<String, String> location : locations.entrySet()){
            System.out.println(location.getKey() + " ,main city ->" + location.getValue());
        }
    }

}
