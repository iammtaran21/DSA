public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Split the string into words using the space character as a delimiter
        String[] words = "Hello, World!".split(" ");
        
        // Use a for loop to iterate over the words and print each one
        for (String word : words) {
            System.out.println(word);
        }
    }
}
