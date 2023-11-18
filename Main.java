public class Main {
    public static void main(String args[]) {
        float x = 12, y = 6, z = 4;

        System.out.println("The average value is " + media(x, y, z));
    }

    public static double media(float x, float y, float z) {
        float media = (x + y + z) / 3;
        return media;
    }
}