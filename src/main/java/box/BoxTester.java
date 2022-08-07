package box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object's length: ");
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width: ");
        float width = scanner.nextFloat();
        System.out.print("Please enter object's height: ");
        float height = scanner.nextFloat();
        Box3 box3 = new Box3(length, width, height);
        Box5 box5 = new Box5(length, width, height);
        if (box3.validate(length, width, height) == true) {
            System.out.println("box.Box3");
        } else if (box5.validate(length, width, height) == true) {
            System.out.println("box.Box5");
        } else {
            System.out.println("No suitable box size!");
        }
    }
}


