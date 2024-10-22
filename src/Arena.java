import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arena {
    private ArrayList<Kämpfer> kaempfer;

    public Arena(ArrayList<Kämpfer> kaempfer) {
        this.kaempfer = kaempfer;
    }

    public Arena(){
        this.kaempfer = new ArrayList<>();
    }

    public void kaempferHinzufügen(Kämpfer kämpfer){
        this.kaempfer.add(kämpfer);
    }
    public void fight(){
        int start = new Random().nextInt(this.kaempfer.size());
        Kämpfer kämpfer = this.kaempfer.get(start);


    }

}
