import java.util.Optional;

public class Optional_Int {
    public static void main(String[] args) {
        // Create an Optional with a value
        Optional<Integer> optionalWithValue = Optional.of(100);

        // Create an empty Optional
        Optional<Integer> optionalEmpty = Optional.empty();

        // Check if the Optional has a value and then retrieve it
        if (optionalWithValue.isPresent()) {
            int value = optionalWithValue.get();
        //printing out the present value + value
            System.out.println("Value is present: " + value);
        // else the value is not present
        } else {
            System.out.println("Value is not present.");
        }

        // Using orElse to provide a default value if the Optional is empty
        int defaultValue = optionalEmpty.orElse(0);
        System.out.println("Default value: " + defaultValue);
    }
}
