import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        System.out.print("рядок s: ");
        String s = scanner.nextLine();

        System.out.print("рядок t: ");
        String t = scanner.nextLine();

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word);

            if (word.endsWith(s)) {
                result.append(t);
            }

            result.append(" ");
        }

        System.out.println("Початковий рядок: " + text);
        System.out.println("Рядок після опрацювання: " + result.toString().trim());
    }
}
