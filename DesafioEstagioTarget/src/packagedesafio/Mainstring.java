package packagedesafio;

import java.util.Scanner;

public class Mainstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma palavra ou frase:");
        String input = scanner.nextLine();

        int count = countLetterA(input);

        if (count > 0) {
            System.out.println("A letra a ocorre " + count + " vez (es) na string.");
        } else {
            System.out.println("A letra a não ocorre na string.");
        }
    }

    private static int countLetterA(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        for (char c : lowerStr.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }
}
