public class ShortCircuitDemo {
    public static void main(String[] args) {
        String s = null; // s is a null reference

        // Short-Circuit AND: s != null is checked first.
        if (s != null && s.length() > 5) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        // Output: Condition is false
    }
}