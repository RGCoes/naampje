import java.util.ArrayList;
import java.util.Scanner;

public class YahtzeeSpel {

    private ArrayList<Dobbelsteen> lijst = new ArrayList<>();
    private char[] blokkeerArray = new char[5];

    Scanner scanner = new Scanner(System.in);

    YahtzeeSpel(){
        lijst.add(new Dobbelsteen());
        lijst.add(new Dobbelsteen());
        lijst.add(new Dobbelsteen());
        lijst.add(new Dobbelsteen());
        lijst.add(new Dobbelsteen());

    }

    void spelen() {

        String doorgaan = "";

        while(doorgaan.equals("")){
            for(Dobbelsteen dobbelsteen : lijst){
                int worp = dobbelsteen.werpen();
                System.out.println("worp = " + worp);
            }
           vasthouden();

            System.out.println("Druk op enter om door te gaan of q om te stoppen");
            doorgaan = scanner.nextLine();
        }
    }

    void vasthouden(){
        System.out.println("Welke dobbelstenen wilt u vasthouden?");
        String invoer = scanner.nextLine();
        System.out.println("Je hebt " + invoer + " ingevuld");
        for(int x = 0 ; x < invoer.length(); x++){
            blokkeerArray[x] = invoer.charAt(x);
        }
        System.out.println(blokkeerArray[3]);
        








    }


}
