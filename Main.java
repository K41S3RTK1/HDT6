import java.util.Map;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
  
          System.out.println("Seleccione el tipo de Map (hashmap, treemap, linkedhashmap): ");
          String mapType = scanner.nextLine();
          
          Map<String, Pokemon> pokemonMap = PokemonFactory.createMap(mapType);
          PokemonManager manager = new PokemonManager(pokemonMap);
          
          while (true) {
              System.out.println("\n1. Agregar Pokémon\n2. Mostrar Pokémon\n3. Mostrar colección ordenada por Type1\n4. Mostrar todos los Pokémon ordenados por Type1\n5. Buscar Pokémon por habilidad\n6. Salir");
              System.out.print("Seleccione una opción: ");
              int option = scanner.nextInt();
              scanner.nextLine();
  
              switch (option) {
                  case 1:
                      System.out.print("Ingrese el nombre del Pokémon: ");
                      String name = scanner.nextLine();
                      manager.addPokemonToCollection(name);
                      break;
                  case 2:
                      System.out.print("Ingrese el nombre del Pokémon: ");
                      name = scanner.nextLine();
                      manager.showPokemon(name);
                      break;
                  case 3:
                      manager.showUserCollectionSortedByType1();
                      break;
                  case 4:
                      manager.showAllPokemonSortedByType1();
                      break;
                  case 5:
                      System.out.print("Ingrese la habilidad: ");
                      String ability = scanner.nextLine();
                      manager.showPokemonByAbility(ability);
                      break;
                  case 6:
                      System.out.println("Saliendo...");
                      return;
                  default:
                      System.out.println("Opción no válida.");
              }
          }
      }
  }
  