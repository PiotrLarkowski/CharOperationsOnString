
public class Main {
    public static void main(String[] args) {
        System.out.println(SqueakyClean.clean("a$#.b"));
        System.out.println(SqueakyClean.clean("Ala ma kota"));
        System.out.println(SqueakyClean.clean("Ala-ma-kota"));
        System.out.println(SqueakyClean.clean("¡1337sp34k is fun!"));
    }
}