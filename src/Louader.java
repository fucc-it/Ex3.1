import java.util.Scanner;

public class Louader {
    public static void main(String[] args) {
        Cirrcle a = new Cirrcle();
        String type;
        int r;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        r = in.nextInt();

        a.setRad(r);
        a.chang();

        System.out.println(a.getDiam());
        System.out.println(a.getP());
        System.out.println(a.getS());
    }
}
