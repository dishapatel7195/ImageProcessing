package img;
import java.io.File;
public class test {

    public static void main(String[] args){
        File input = new File("/Users/dishapatel/Downloads/1hello-world.jpg");
        File output = new File("/Users/dishapatel/Downloads/rotate90.jpg");
        imageRotate.rotate90(input,output, imageRotate.ROTATE_LEFT);
    }

}
