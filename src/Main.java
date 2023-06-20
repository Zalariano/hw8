import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] czisla = new int[3];
        czisla[0] = 1;
        czisla[1] = 2;
        czisla[2] = 3;
        for (int i = 0; i < czisla.length - 1; i++) {
            System.out.print(czisla[i] + ", ");
        }
        System.out.print(czisla[2]);
        System.out.println();
        System.out.print(czisla[2] + ", " + czisla[1] + ", " + czisla[0]);
        System.out.println();

        double[] massivZadaczyDwa = {1.57, 7.654, 9.986};
        System.out.print(massivZadaczyDwa[0] + ", " + massivZadaczyDwa[1] + ", " + massivZadaczyDwa[2]);
        System.out.println();
        System.out.print(massivZadaczyDwa[2] + ", " + massivZadaczyDwa[1] + ", " + massivZadaczyDwa[0]);
        System.out.println();

        byte[] massivZadaczyThree = {-10, 20, 126, 44};
        System.out.print(massivZadaczyThree[0] + ", " + massivZadaczyThree[1] + ", " + massivZadaczyThree[2] + ", " + massivZadaczyThree[3]);
        System.out.println();
        System.out.print(massivZadaczyThree[3] + ", " + massivZadaczyThree[2] + ", " + massivZadaczyThree[1] + ", " + massivZadaczyThree[0]);
        System.out.println();


        int[] czislaczetnyje = {1, 2, 3};
        for (int index = 0; index < czislaczetnyje.length; index++) {
            if (index % 2 == 0) {
                czislaczetnyje[index]++;
            }
        }
        System.out.println(Arrays.toString(czislaczetnyje));
    }
}