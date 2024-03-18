public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(identifier);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ' ') {
                stringBuilder.replace(i,i+1,"_");
            }
            if (stringBuilder.charAt(i) == '-') {
                char letter = stringBuilder.charAt(i+1);
                stringBuilder.replace(i,i+2,""+Character.toUpperCase(letter));
            }
        }
        return stringBuilder.toString();
    }
}
