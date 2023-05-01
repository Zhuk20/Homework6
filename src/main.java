public class main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();
        System.out.println("Задание 2");
        task2();
        System.out.println("Задание 3");
        task3();
        System.out.println("Задание 4");
        task4();
        System.out.println("Задание 5");
        task5();
        System.out.println("Задание 6");
        task6();
        System.out.println("Задание 7");
        task7();
        System.out.println("Задание 8");
        task8();
        System.out.println("Задание 9");
        task9();
        System.out.println("Задание 10");
        task10();
    }

    private static void task10() {
        int digit = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(digit + " * " + i + " = " + digit * i);
        }
    }

    private static void task9() {
        int salary = 29000;
        float total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            total = total + total * 0.01f;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task8() {
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task7() {
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
    }

    private static void task6() {
        for (int i = 7; i <= 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task5() {
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    private static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    private static void task3() {
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    private static void task2() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

}