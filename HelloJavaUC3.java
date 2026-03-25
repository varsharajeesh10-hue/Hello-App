public class HelloJavaUC3 {

    public static void main(String[] args) {

        // default name
        String name = "World";

        // check if user provided an argument
        if (args.length > 0) {
            name = args[0];
        }

        // print greeting
        System.out.println("Hello, " + name + "!");
    }

}