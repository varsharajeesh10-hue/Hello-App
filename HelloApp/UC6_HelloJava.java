public class UC6_HelloJava{
    public static void main(String[] args) {

        String text = "HelloWorld";

        // Extract substring from index 0 to 5
        String part1 = text.substring(0, 5);

        // Extract substring from index 5 to end
        String part2 = text.substring(5);

        System.out.println("Original String: " + text);
        System.out.println("Substring (0 to 5): " + part1);
        System.out.println("Substring (5 to end): " + part2);
    }
}