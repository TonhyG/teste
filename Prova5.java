import java.util.Scanner;

public class Prova5 {

    public static void main(String[] args) {
        // Entrada da string pelo usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String original = scanner.nextLine();

        // Array de caracteres da string original
        char[] caracteres = original.toCharArray();

        // Inverter os caracteres manualmente
        String invertida = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }

        // Exibir a string invertida
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }
}
