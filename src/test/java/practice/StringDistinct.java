package practice;
import java.util.*;


//List contains활용 하거나 HashSet 사용
public class StringDistinct {
    public static void main(String[] args) {

        String question = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
        String[] str = question.split(",");
        HashSet<String> strResult = new HashSet<>();
        int klCount = 0;
        int leeCount = 0;
        String[] strResultResult;


        for (int i = 0; i < str.length; i++) {
            String[] first = str[i].split("");
            if (first[0].equals("김") || first[0].equals("이")) {
                klCount++;
            }
            if (str[i].equals("이재영")) {
                leeCount++;
            }
            strResult.add(str[i]);

        }
        System.out.println();
        strResultResult = new String[strResult.size()];
        Iterator<String> iter = strResult.iterator();
        for (int i = 0; i < strResult.size(); i++) {
            if (iter.hasNext())
                strResultResult[i] = iter.next();
        }
        System.out.println("김씨와 이씨: " + klCount);
        System.out.println("이재영: " + leeCount);
        System.out.println(Arrays.toString(strResultResult));
        Arrays.sort(strResultResult);
        System.out.println(Arrays.toString(strResultResult));

    }
}
