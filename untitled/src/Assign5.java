public class Assign5 {
    public static void main(String[] args) {

        int carH = 170;
        int a = 170; // 터널1의 높이
        int b = 168; // 터널2의 높이
        int c = 175; // 터널3의 높이

        if (carH >= a || carH >= b || carH >= c) {
            System.out.println("CRASH");
        } else {
            System.out.println("PASS");

        }
    }
}

