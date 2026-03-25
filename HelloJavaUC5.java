public class HelloJavaUC5 {

    public static void main(String[] args) {

        // default value
        String name = "World";

        // if arguments are given
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String n : args) {

                if (!first) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(n);
                first = false;
            }

            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}
