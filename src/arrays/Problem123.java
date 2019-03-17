package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem123 {

    static Object[][] endings = new Object[3][3];

    static String[] personalPronouns = { "yo", "tu", "el", "nosotros", "vosotros", "ellos" };

    public static boolean resolveCase(String input) {
        String infinitive = input.split(" ")[0];
        String prefix = infinitive.substring(0, infinitive.length() - 2);

        switch (input.substring(input.length() - 4, input.length())) {
        case "ar A":
            printVerbs(prefix, (String[]) endings[0][0]);
            break;
        case "ar P":
            printVerbs(prefix, (String[]) endings[0][1]);
            break;
        case "ar F":
            printVerbs(prefix, (String[]) endings[0][2]);
            break;
        case "er A":
            printVerbs(prefix, (String[]) endings[1][0]);
            break;
        case "er P":
            printVerbs(prefix, (String[]) endings[1][1]);
            break;
        case "er F":
            printVerbs(prefix, (String[]) endings[1][2]);
            break;
        case "ir A":
            printVerbs(prefix, (String[]) endings[2][0]);
            break;
        case "ir P":
            printVerbs(prefix, (String[]) endings[2][1]);
            break;
        case "ir F":
            printVerbs(prefix, (String[]) endings[2][2]);
            break;
        default:
            return false;
        }

        return true;
    }

    // O(n) time complexity
    public static void printVerbs(String prefix, String endings1[]) {
        for (int i = 0; i < personalPronouns.length; i++) {
            System.out.println(personalPronouns[i] + " " + prefix + endings1[i]);
        }
    }

    public static void main(String[] args) {

        String arEndingPresent[] = { "o", "as", "a", "amos", "ais", "an" };
        String arEndingSimplePast[] = { "e", "aste", "o", "amos", "asteis", "aron" };
        String arSimpleFuture[] = { "are", "aras", "ara", "aremos", "areis", "aran" };

        String erEndingPresent[] = { "o", "es", "e", "emos", "eis", "en" };
        String erEndingSimplePast[] = { "i", "iste", "io", "imos", "isteis", "ieron" };
        String erSimpleFuture[] = { "ere", "eras", "era", "eremos", "ereis", "eran" };

        String irEndingPresent[] = { "o", "es", "e", "imos", "is", "en" };
        String irEndingSimplePast[] = { "i", "iste", "io", "imos", "isteis", "ieron" };
        String irSimpleFuture[] = { "ire", "iras", "ira", "iremos", "ireis", "iran" };

        endings[0][0] = arEndingPresent;
        endings[0][1] = arEndingSimplePast;
        endings[0][2] = arSimpleFuture;

        endings[1][0] = erEndingPresent;
        endings[1][1] = erEndingSimplePast;
        endings[1][2] = erSimpleFuture;

        endings[2][0] = irEndingPresent;
        endings[2][1] = irEndingSimplePast;
        endings[2][2] = irSimpleFuture;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (resolveCase(input.readLine()))
                ;
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
