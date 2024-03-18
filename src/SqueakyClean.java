import java.util.HashMap;
import java.util.Map;

public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(identifier);
        Map<Character, Character> mapOfLetterConnectedToTranslation = new HashMap<>();
        mapOfLetterConnectedToTranslation.put('0', 'o');
        mapOfLetterConnectedToTranslation.put('1', 'l');
        mapOfLetterConnectedToTranslation.put('3', 'e');
        mapOfLetterConnectedToTranslation.put('4', 'a');
        mapOfLetterConnectedToTranslation.put('7', 't');
        mapOfLetterConnectedToTranslation.put(' ', '_');
        mapOfLetterConnectedToTranslation.put('-', ' ');
        boolean isInArray = true;
        char[] allowedLetterArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u'
                , 'w', 'z', 'x', 'y', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'W',
                'Z', 'X', 'Y', '-', '0', '1', '3', '4', '7', ' '};
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < allowedLetterArray.length; j++) {
                if (stringBuilder.charAt(i) != allowedLetterArray[j]) {
                    isInArray = false;
                } else {
                    isInArray = true;
                    break;
                }
            }
            if (!isInArray) {
                stringBuilder.replace(i, i + 1, "");
                i--;
            }
            isInArray = true;
        }
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (mapOfLetterConnectedToTranslation.containsKey(stringBuilder.charAt(i))) {
                if(stringBuilder.charAt(i) == '-'){
                    char letter = stringBuilder.charAt(i + 1);
                    stringBuilder.replace(i, i + 2, "" + Character.toUpperCase(letter));
                }else {
                    stringBuilder.replace(i, i + 1, "" + mapOfLetterConnectedToTranslation.get(stringBuilder.charAt(i)));
                }
            }
        }
        return stringBuilder.toString();
    }
}