public class PrintF {
    public static void main(String[] args){

        // printf: An optional method to control, fromat and display text to the console window
        //      Two Arguments: Format String + (Object/Variable/Value)
        //      % [flags] [Precision] [width] [Coneversion-Character]

        System.out.printf("%d This is the Formatted String \n", 123);

        boolean myBoolean = false;
        char myChar = '@';
        int myInt = 33;
        String myString = "Aman";
        double myDouble = 10000;

        // [Conversion-characters]
        System.out.printf("%b \n", myBoolean);
        System.out.printf("%c \n", myChar);
        System.out.printf("%s \n", myString);
        System.out.printf("%d \n", myInt);
        System.out.printf("%f \n", myDouble);

        // [Widths]: Adds minimum number of spaces for the corresponding character
        System.out.printf("Hello %10s \n", myString);

        //[Precision]: Sets the number of digits of precision when outputting floating point numbers
        System.out.printf("You have %.2f Rs. with you \n", myDouble);

        //[Flags]: Adds an effect on the output based on the flag added
        // - : left-justify
        // + : Adds A plus(+) or Minus(-) sign for numeric values
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if number > 1000

        System.out.printf("You have %020f Rs. with you \n", myDouble);
        System.out.printf("You have %,f Rs. with you \n", myDouble);
        System.out.printf("You have %-20f Rs. with you \n", myDouble);

        // Final KeyWord: It works exactly like 'const' in c++, declaring a variable as final cannot be changed anywhere in the program
        // A common naming convention is to name your final variables as upperCase characters

        final double PI = 3.14159;
        // PI = 4.21;
        System.out.println("Value of pi is "+PI+" , and it cannot be changed");
    }
}