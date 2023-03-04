import java.util.Scanner;

public class PointOfStart {

    public PointOfStart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение по X и по Y");
        x = scanner.nextInt();
        y = scanner.nextInt();
    }
    int x;
    int y;
    public int[] getStartPosision() {
        return new int[] {this.x, this.y};
    }
}
