import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        int contador;

        while (!(frase = scanner.nextLine()).equals("FIM")) {
            contador = 0;
            int len = frase.length();
            for (int i = 0; i  < len; i++) {
                if (Character.isUpperCase(frase.charAt(i))) {
                    contador++;
                }
            }
            System.out.println(contador);
        }
        scanner.close();
    }
}
