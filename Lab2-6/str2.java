import java.util.LinkedHashSet;
import java.util.Set;

public class str2 {
    public static void main(String[] args) {

        String str = new String("Кішка бігла по саду. Кішка побачила птаха. Птах злякався і полетів. Кішка знову бігла за птахом. Сад був великий, а кішка швидка. Птах летів високо, а кішка бігла низько.");

        System.out.println("Текст: "+str);

        str = str.replaceAll("[.,]", "");

        String[] words = str.split("\\s+");

        Set<String> uniqueWords = new LinkedHashSet<>();

        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); 
        }

        StringBuilder builder = new StringBuilder();
        for (String word : uniqueWords) {
            builder.append(word).append(" ");
        }

        System.out.println("Текст без повторюваних слів: "+builder);
    }
}
