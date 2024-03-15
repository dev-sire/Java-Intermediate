public class Pattern{

    // all possible Pyramid Pattern Problems
     
    public static void rightHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftHalfPyramid(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=n-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseRightHalfPyramid(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseLeftHalfPyramid(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int num = 6;
        
        rightHalfPyramid(num);
        System.out.print("\n");

        reverseRightHalfPyramid(num);
        System.out.print("\n");

        leftHalfPyramid(num);
        System.out.print("\n");

        reverseLeftHalfPyramid(num);
    }
}