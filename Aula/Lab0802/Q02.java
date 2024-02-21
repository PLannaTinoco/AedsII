import java.util.Scanner;

public class Q01{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String frase = scanner.nextLine();
        while (!frase.equals("FIM")) {
            int contador = contarMaiusculas(frase, 0);
            System.out.println(contador);
            frase = scanner.nextLine();
        }
        scanner.close();
    }

    public static int contarMaiusculas(String frase, int index) {
        if (index == frase.length()) {
            return 0;
        } else {
            int contador = Character.isUpperCase(frase.charAt(index)) ? 1 : 0;
            return contador + contarMaiusculas(frase, index + 1);
        }
    }
}
