public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(identifier);
        boolean isInArray = true;
        char[] allowedLetterArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u'
                ,'w','z','x','y','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','W',
                'Z','X','Y','-','0','1','3','4','7','!','¡',' '};
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < allowedLetterArray.length; j++) {
                if(stringBuilder.charAt(i)!=allowedLetterArray[j]){
                    isInArray = false;
                }else{
                    isInArray = true;
                    break;
                }
            }
            if(!isInArray){
                stringBuilder.replace(i, i + 1, "");
                i--;
            }
            isInArray = true;
        }
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ' ') {
                stringBuilder.replace(i, i + 1, "_");
                i--;
                continue;
            }
            if (stringBuilder.charAt(i) == '-') {
                char letter = stringBuilder.charAt(i + 1);
                stringBuilder.replace(i, i + 2, "" + Character.toUpperCase(letter));
                i--;
                continue;
            }
            if (stringBuilder.charAt(i) == '0') {
                stringBuilder.replace(i, i + 1, "o");
                i--;
                continue;
            }
            if (stringBuilder.charAt(i) == '1') {
                stringBuilder.replace(i, i + 1, "l");
                i--;
                continue;
            }
            if (stringBuilder.charAt(i) == '3') {
                stringBuilder.replace(i, i + 1, "e");
                i--;
                continue;
            }
            if (stringBuilder.charAt(i) == '4') {
                stringBuilder.replace(i, i + 1, "a");
                i--;
                continue;
            }
            if (stringBuilder.charAt(i) == '7') {
                stringBuilder.replace(i, i + 1, "t");
                i--;
                continue;
            }
            if (stringBuilder.charAt(i) == '!') {
                stringBuilder.replace(i, i + 1, "");
                i--;
                continue;
            }
            if (stringBuilder.charAt(i) == '¡') {
                stringBuilder.replace(i, i + 1, "");
                i--;
            }
        }
        return stringBuilder.toString();
    }
}
