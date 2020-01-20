package iterator;


import java.util.Iterator;

public class Waitress {

    private PancakeHouseMenu pancakeHouseMenu;
    private DinnerMenu dinnerMenu;


    public static void main(String[] args) {
        printMenu();
    }

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    private static void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        System.out.println("메뉴\n---\n아침메뉴");
        printMenu(pancakeHouseMenuIterator);

        DinnerMenu dinnerMenu = new DinnerMenu();
        Iterator dinnerMenuIterator = dinnerMenu.createIterator();
        System.out.println("메뉴\n---\n점심메뉴");
        printMenu(dinnerMenuIterator);
    }

    // 반복을 Iterator 인터페이스로 캡슐화한다
    private static void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
