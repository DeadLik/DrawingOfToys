package DrawingToysInAChildrenGoodsStore;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Raffle r = new Raffle();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Главное меню:
                    1 - Добавьте новую игрушку в призовой фонд
                    2 - Изменить частоту выпадения какой-либо игрушки
                    3 - Проведите розыгрыш и сохраните результаты
                    0 - Выход
                    >\s""");
            var selection = sc.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("Пока");
                    System.exit(0);
                }
                default -> System.out.println("Неправильный выбор. Попробуйте еще раз.");
            }
        }
    }
}
