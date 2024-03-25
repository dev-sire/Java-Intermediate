public class Bitwise {
    public static void main(String[] args){
        byte val1 = 12;     // 0000 1100
        byte val2 = 10;     // 0000 1010
        byte res;

        // 12 = 8+4 => 0000 1100 => 1111 0011 => -(0000 1100 + 1) => -(12 + 1) => -13
        res = (byte) ~val1;
        System.out.println("The result: "+res);
        
        res = (byte) (val1 | val2);     // Bitwise OR 
        System.out.println("The result: "+res);
        
        res = (byte) (val1 & val2);     // Bitwise AND
        System.out.println("The result: "+res);

        res = (byte) (val1 ^ val2);     // Bitwise XOR
        System.out.println("The result: "+res);

        // 0000 1100 => 0011 0000 => 32+16 => 48
        res = (byte) (val1 << 2);       // Shifts 2 bits to the left
        System.out.println("The result: "+res);

        // 0000 1100 => 0000 0011 => 2+1 => 3
        res = (byte) (val1 >> 2);       // shifts 2 bits to the right
        System.out.println("The result: "+res);
    }
}
