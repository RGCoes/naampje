public class Dobbelsteen {
    private int worp;


    int werpen(){
        worp = (int)(Math.random() * 6 + 1);
        return worp;
    }
}
