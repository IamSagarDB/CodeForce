package in.dropcodes;

/**
 * Created by Sagar D B on Aug, 2020, 21:23
 * GitHub: github.com/iamsagardb
 * <p>
 * Problem level:
 * <p>
 * Question:
 *
 * Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.
 *
 * Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.
 *
 * This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.
 *
 * Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".
 *
 * You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.
 *
 * Input
 * The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.
 *
 * Output
 * Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.
 *
 * Examples
 *
 * input
 * 4
 * word
 * localization
 * internationalization
 * pneumonoultramicroscopicsilicovolcanoconiosis
 *
 * output
 * word
 * l10n
 * i18n
 * p43s
 */
import java.util.Scanner;

public class Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i <= n; i++) {
            String str = s.nextLine();
            if (str.length() > 10) {
                str = str.charAt(0) + "" + (str.length() - 2) + str.charAt(str.length() - 1);
                System.out.println(str);
            } else {
                System.out.println(str);
            }
        }

    }
}
