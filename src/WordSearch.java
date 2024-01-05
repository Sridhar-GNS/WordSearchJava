import java.util.*;

public class WordSearch {


    public static void main(String[] args) {
        String[] lines = {
                "Java is a object oriented programming language",
                "Here comes the second line",
                "And this is the third line",
                "I will add a fourth line",
                "This is the fifth and final line",
                "line six"
        };

        Map<String, List<Integer>> wordMap = new HashMap<>();


        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split("\\s+");
            for (String word : words) {
                word = word.toLowerCase();
                if (!wordMap.containsKey(word)) {
                    wordMap.put(word, new ArrayList<>());
                }
                wordMap.get(word).add(i + 1);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER A WORD: ");
        String searchWord = scanner.next().toLowerCase();

        if (wordMap.containsKey(searchWord)) {
            List<Integer> foundLines = wordMap.get(searchWord);
            System.out.println( foundLines);
        } else {
            System.out.println(" not found");
        }

        System.out.print("Enter line number: ");
        int lineNumber = scanner.nextInt();
        if (lineNumber >= 1 && lineNumber <= lines.length) {
            String[] words = lines[lineNumber - 1].split("\\s+");
            for (String word : words) {
                System.out.print(word+" ");
            }
        } else {
            System.out.println("Invalid line number");
        }
        scanner.close();
    }
}
