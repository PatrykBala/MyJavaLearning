import static java.lang.Math.*;
public class OutPut {
    public static void main(String[] args) {
        double x = 9.997;
        int y = (int)Math.round(x);
        System.out.println(y);

        enum Rozmiar { MAŁY, ŚREDNI, DUŻY, EKSTRA_DUŻY};
        Rozmiar s = Rozmiar.ŚREDNI;
        System.out.println(s);
    }
}