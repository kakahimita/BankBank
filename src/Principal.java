import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double temperatura = 25.42;

        double mediaTemperatura = ((temperatura * 1.8) + 32);
        int mediaAlone = (int) mediaTemperatura;

        System.out.println(mediaTemperatura);
        System.out.println(mediaAlone);

        System.out.println(String.format("temperatura atual %.2f, temperatura e fight %f, temperatura normal %d", temperatura, mediaTemperatura, mediaAlone));






    }
}
