
public class WhileSample {

    public static void main(String[] args) {
        int num = 1;

        do {
            num = num * 2;

            System.out.println(num);
        } while (num < 1024);
    }
}