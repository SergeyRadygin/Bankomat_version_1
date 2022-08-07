import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bankomat version 1");

        System.out.println("Как к вам можно обраща́ться?");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double balance = 0;

        System.out.println("Приветствую " + name + "!");
        System.out.println("---------------------");

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Получить баланс");
            System.out.println("2. Пополнить баланс");
            System.out.println("3. Отправить деньги");
            System.out.println("4. Выход");

            int operation = scanner.nextInt();

            if (operation == 1) {
                System.out.println("---------------------");
                System.out.println("Ваш баланс " + balance);
                System.out.println("---------------------");
            } else if (operation == 2) {
                System.out.println("На сколько пополнить баланс:");
                double deposit = scanner.nextDouble();
                if (deposit >= 0) {
                    balance += deposit;
                    System.out.println("---------------------");
                    System.out.println("Ваш баланс " + balance);
                    System.out.println("---------------------");
                } else
                    System.out.println("Нельзя вводить отрицательное число!");
            } else if (operation == 3) {
                System.out.println("Сколько денег перевести:");
                double sendMoney = scanner.nextDouble();
                if (sendMoney > balance) {
                    balance += sendMoney;
                    System.out.println("---------------------");
                    System.out.println("Ваш баланс " + balance);
                    System.out.println("---------------------");
                } else
                    System.out.println("Нельзя перевести денег больше чем у вас есть на счету!");
                balance -= sendMoney;
                System.out.println("---------------------");
                System.out.println("Ваш баланс " + balance);
                System.out.println("---------------------");
            } else if (operation == 4) {
                break;
            } else
                System.out.println("Нет такой операции!");


        }
    }
}