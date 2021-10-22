public class Main {
    public static void main(String[] args) {
        CaesarCodec codec = new CaesarCodec(3);
        String test = codec.encode("THE QUICK, BROWN FOX JUMPS OVER THE LAZY DOG");
        System.out.println(test);
        System.out.println(codec.decode(test));
//        System.out.println(codec.decode("THE QUICK, BROWN FOX JUMPS OVER THE LAZY DOG"));
    }
}
