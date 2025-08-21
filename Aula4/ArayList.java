import java.util.ArrayList;
import java.util.Random;

public class ArayList {
public static void main(String[] args) {

    ArrayList<Integer> numeros = new ArrayList<>();
    Random random = new Random();

    for(int i=0;i<10;i++) {
        int aleatorio = random.nextInt(50);
        numeros.add(aleatorio);
        if (aleatorio % 2 ==0) {
            System.out.println("Imprimindo os números pares: ");
            System.out.println("Posição " + i + ":" + aleatorio);

        }

    }
    System.out.println(numeros);
    }
}

