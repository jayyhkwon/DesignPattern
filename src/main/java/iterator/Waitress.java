package iterator;

import java.util.ArrayList;

public class Waitress {

    public static void main(String[] args) {
        printMenu();
    }

    public static void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinnerMenu dinnerMenu = new DinnerMenu();
        MenuItem[] launchItems = dinnerMenu.getMenuItems();

        // 반복로직 코드가 중복된다
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

        // 반복로직 코드가 중복된다
        for (int i = 0; i < launchItems.length; i++) {
            MenuItem menuItem = launchItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

        // 반복로직을 캡슐화 할 순 없을까?
    }
}
