public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(identifier);

        for (int i = 0; i < identifier.length(); i++) {
            if (stringBuilder.charAt(i) == ' ') {
                stringBuilder.replace(i,i+1,"_");
            }
        }
        return stringBuilder.toString();
    }
}
