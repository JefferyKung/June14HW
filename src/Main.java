import animalkingdom.Animal;
import animalkingdom.Crocodile;
import animalkingdom.Eagle;
import animalkingdom.Eel;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Crocodile croc = new Crocodile();
        System.out.println(croc.showInfo());

        Eel eel = new Eel();
        System.out.println(eel.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
    }
}
