import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class PokemonManagerTest {
    @Test
    public void testAddPokemonToCollection() {
        Map<String, Pokemon> pokemonMap = new HashMap<>();
        pokemonMap.put("Pikachu", new Pokemon("Pikachu", "Electric", null, Arrays.asList("Static")));
        PokemonManager manager = new PokemonManager(pokemonMap);

        manager.addPokemonToCollection("Pikachu");
        assertEquals(1, manager.userCollection.size());
    }

    @Test
    public void testShowPokemonByAbility() {
        Map<String, Pokemon> pokemonMap = new HashMap<>();
        pokemonMap.put("Charizard", new Pokemon("Charizard", "Fire", "Flying", Arrays.asList("Blaze")));
        PokemonManager manager = new PokemonManager(pokemonMap);

        manager.showPokemonByAbility("Blaze");
        // Validar salida manualmente
    }
}
