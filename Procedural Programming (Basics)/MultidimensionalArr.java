public class MultidimensionalArr{
    public static void main(String[] args){
        // 2D Arrays = An array of arrays
        String[][] Cars = new String[3][3];
        //Row 1 Array 1
        Cars[0][0] = "Camero";
        Cars[0][1] = "Corvette";
        Cars[0][2] = "Silverado";
        //Row 2 Array 2
        Cars[1][0] = "Mustang";
        Cars[1][1] = "Ranger";
        Cars[1][2] = "F-150";
        //Row 3 Array 3
        Cars[2][0] = "Ferrai";
        Cars[2][1] = "Lamborghini";
        Cars[2][2] = "Tesla";

        for(int i=0;i<Cars.length; i++){
            System.out.println();
            for(int j=0; j<Cars[i].length; j++){
                System.out.println(Cars[i][j]+" ");
            }
        }
    }
}