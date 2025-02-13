import java.util.*;
  public class TestCollection {
    public static void main(String[] args) {
        HashSet<String> collection1 = new HashSet<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("A list of cities in collection1:");
        System.out.println(collection1);


        System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dallas"));
        collection1.remove("Dallas");

        System.out.println("\n" + collection1.size() + " cities are in collection1 now");
        System.out.println(collection1);

        Collection<String> collection2 = new HashSet<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\nA list of cities in collection2:");
        System.out.println(collection2);

        HashSet<String> c1 = (HashSet<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);

        c1 = (HashSet<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.print("\nCities in collection1 and collection2: ");
        System.out.println(c1);

        c1 = (HashSet<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.print("\nCities in collection1, but not in 2: ");
        System.out.println(c1);
        }      }