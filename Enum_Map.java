import java.util.EnumMap;

public class Enum_Map {
    public static void main(String[] args) {
    EnumMap <difficulty, Integer> levels = new EnumMap<>(difficulty.class);
         levels.put(difficulty.easy, 1);
         levels.put(difficulty.medium, 2);
         levels.put(difficulty.hard, 3);
         levels.put(difficulty.impossible, 4);

        //printing content of enum map
         System.out.println("content: "+levels);
         
        //printing specific content of enum map
         System.out.println("content with key = hard: "+levels.get(difficulty.hard));
    }
}
    //placing constant values in difficulty enum
    enum difficulty{
        easy, medium, hard, impossible
    }
