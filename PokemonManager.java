import java.util.*;
import java.util.stream.Collectors;

public class PokemonManager {
    private Map<String, Pokemon> pokemonMap;
    private Set<Pokemon> userCollection;

    public PokemonManager(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
        this.userCollection = new HashSet<>();
    }

    public void addPokemonToCollection(String name) {
        if (pokemonMap.containsKey(name)) {
            Pokemon pokemon = pokemonMap.get(name);
            if (userCollection.contains(pokemon)) {
                System.out.println("El Pokémon ya está en la colección.");
            } else {
                userCollection.add(pokemon);
                System.out.println("Pokémon agregado a la colección.");
            }
        } else {
            System.out.println("El Pokémon no se encuentra en los datos.");
        }
    }

    public void showPokemon(String name) {
        if (pokemonMap.containsKey(name)) {
            System.out.println(pokemonMap.get(name));
        } else {
            System.out.println("El Pokémon no existe en los datos.");
        }
    }

    public void showUserCollectionSortedByType1() {
        List<Pokemon> sortedList = userCollection.stream()
                .sorted(Comparator.comparing(Pokemon::getType1))
                .collect(Collectors.toList());
        sortedList.forEach(p -> System.out.println(p.getName() + " - " + p.getType1()));
    }

    public void showAllPokemonSortedByType1() {
        List<Pokemon> sortedList = new ArrayList<>(pokemonMap.values());
        sortedList.sort(Comparator.comparing(Pokemon::getType1));
        sortedList.forEach(p -> System.out.println(p.getName() + " - " + p.getType1()));
    }

    public void showPokemonByAbility(String ability) {
        pokemonMap.values().stream()
                .filter(p -> p.getAbilities().contains(ability))
                .forEach(p -> System.out.println(p.getName()));
    }
}
