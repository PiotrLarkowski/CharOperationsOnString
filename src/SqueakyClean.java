public class SqueakyClean {
    static String clean(String identifier) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(identifier);

        for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i) == ' ') {
                    stringBuilder.replace(i,i+1,"_");
                    i--;
                    continue;
                }
                if (stringBuilder.charAt(i) == '-') {
                    char letter = stringBuilder.charAt(i+1);
                    stringBuilder.replace(i,i+2,""+Character.toUpperCase(letter));
                    i--;
                    continue;
                }
                if (stringBuilder.charAt(i) == '0') {
                    stringBuilder.replace(i,i+1,"o");
                    i--;
                    continue;
                }
                if (stringBuilder.charAt(i) == '1') {
                    stringBuilder.replace(i,i+1,"l");
                    i--;
                    continue;
                }
                if (stringBuilder.charAt(i) == '3') {
                    stringBuilder.replace(i,i+1,"e");
                    i--;
                    continue;
                }
                if (stringBuilder.charAt(i) == '4') {
                    stringBuilder.replace(i,i+1,"a");
                    i--;
                    continue;
                }
                if (stringBuilder.charAt(i) == '7') {
                    stringBuilder.replace(i,i+1,"t");
                    i--;
                    continue;
                }
                if (stringBuilder.charAt(i) == '!') {
                    stringBuilder.replace(i,i+1,"");
                    i--;
                    continue;
                }
                if (stringBuilder.charAt(i) == '¡') {
                    stringBuilder.replace(i,i+1,"");
                    i--;
                    continue;
                }
            }
            return stringBuilder.toString();
    }
}
