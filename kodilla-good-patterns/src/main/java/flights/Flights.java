package flights;

import java.security.Key;
import java.util.HashMap;

public class Flights {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



    public HashMap<String, String> flights() {

        HashMap<String, String> connections = new HashMap<>();
        connections.put("Ankara", "Delhi");
        connections.put("Delhi", "Sydney");
        connections.put("Ankara", "Berlin");
        connections.put("Berlin", "Bogota");
        connections.put("Berlin", "Roma");
        connections.put("Roma", "Khartoum");

        return connections;

    }
//    @Override
//    public int hashCode() {
//        return flights();
//    }
}
