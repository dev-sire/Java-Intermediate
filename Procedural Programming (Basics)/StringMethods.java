public class StringMethods {
    public static void main(String[] args){
        // String: A reference datatype that can store one or more Characters
        // "Reference Datatypes" have access to some useful "METHODS" 

        String name = "Aman";
        boolean result;

        // Equals: Comapare two strings and returns boolean (It is case sensitive)

        result = name.equals("Aman");
        System.out.println(result);
        result = name.equals("aman");
        System.out.println(result);

        // Equals Ignore Case: Equals but not Case sensitive

        result = name.equalsIgnoreCase("aman");
        System.out.println(result);

        // Length: returns length or number of Characters

        int length = name.length();
        System.out.println(length);

        // Char At: Returns a character at given index in the string
        
        char character = name.charAt(0);
        System.out.println(character);

        // Index of: returns the index of a given character

        int index = name.indexOf('a');
        System.out.println(index);

        // Is Empty: Returns a boolean after checking if the given string is empty or not
        
        boolean empty = name.isEmpty();
        System.out.println(empty);

        // to uppercase / to lowercase: changes all the letters in a string to upperCase or lowerCase

        String upr = name.toUpperCase();
        String lwr = name.toLowerCase();
        System.out.println(upr+" "+lwr);

        // Trim: Removes Spaces bedore and after the string

        name = "    Aman    ";
        String trimmed = name.trim();
        System.out.println(trimmed);

        // Replace: Replaces Character at given index with the given Character
        
        String replace = trimmed.replace('a', 'j');
        System.out.println(replace);
    }
}
