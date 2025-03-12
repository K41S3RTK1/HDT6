import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PokemonFactory {
    public static Map<String, Pokemon> createMap(String type) {
        switch (type.toLowerCase()) {
            case "hashmap":
                return new HashMap<>();
            case "treemap":
                return new TreeMap<>();
            case "linkedhashmap":
                return new LinkedHashMap<>();
            default:
                throw new IllegalArgumentException("Tipo de Map no válido");
        }
    }
}
