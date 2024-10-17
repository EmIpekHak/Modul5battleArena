import java.util.Random;
import java.util.Scanner;

public class Arena {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    private Kämpfer kämpfer1;
    private Kämpfer kämpfer2;
    private Kämpfer kämpfer3;
    private Kämpfer gewinner = null;

    public Arena(Scanner scanner, Random rand, Kämpfer kämpfer1, Kämpfer kämpfer2, Kämpfer kämpfer3, Kämpfer gewinner) {
        this.scanner = scanner;
        this.rand = rand;
        this.kämpfer1 = kämpfer1;
        this.kämpfer2 = kämpfer2;
        this.kämpfer3 = kämpfer3;
        this.gewinner = gewinner;
    }
    public void Fight(){

    }

}
