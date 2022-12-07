public class Main {
    public static void main(String[] args) {
        String a = "are you able to climb, are you able to swim or are you able to fly?";
        String b = a.replaceAll("\sare", "_XYZ");

        System.out.println(b);
    }
}