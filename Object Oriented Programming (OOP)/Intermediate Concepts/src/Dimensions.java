public class Dimensions {

    double width, height, depth;

    Dimensions(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Dimensions(){
        width = height = depth = 0;
    }
    Dimensions(double len){
        width = height = depth = len;
    }
    double volumn(){
        return width*height*depth;
    }
}
