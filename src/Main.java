public class Main {
    public static void main(String[] args) {

        System.out.println("Циклы. Часть 2.");
        Задание_1_1();
        Задание_1_2();
        Задание_1_3();
        Задание_2_1();
        Задание_2_2();
        Задание_2_3();
        Задание_2_4();
        Задание_3_1();
        Задание_3_2();


    }

    public static void Задание_1_1() {
        System.out.println("Задание 1");
        int part = 15_000;
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; sumWithPercent <= 2_459_000; i++) {
            sumWithPercent = (sumWithPercent + part) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей.");
        }
        System.out.println();
    }

    public static void Задание_1_2() {
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println();
    }

    public static void Задание_1_3() {
        System.out.println("Задание 3");
        int all = 12_000_000;
        int part = 1_000;
        int birthRate = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            all = (all + (birthRate - mortality) * all / part);
            System.out.println("Год " + i + ", численность населения составляет " + all);
        }
        System.out.println();
    }

    public static void Задание_2_1() {
        System.out.println("Задание 1");
        double sumWithPercent = 15_000;
        double percent = 0.07;
        for (int i = 1; sumWithPercent <= 12_000_000; i++) {
            sumWithPercent = sumWithPercent * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей.");
        }
        System.out.println();
    }

    public static void Задание_2_2() {
        System.out.println("Задание 2");
        double sumPercent = 15_000;
        double percent = 0.07;
        for (int i = 1; sumPercent <= 12_000_000; i++) {
            sumPercent = sumPercent * (1 + percent);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sumPercent + " рублей.");
            }
        }
        System.out.println();
    }

    public static void Задание_2_3() {
        System.out.println("Задание 3");
        double sumPercent = 15_000;
        double percent = 0.07;
        for (int i = 1; i <= 108; i++) {
            sumPercent = sumPercent * (1 + percent);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sumPercent + " рублей.");
            }
        }
        System.out.println();
    }

    public static void Задание_2_4() {
        System.out.println("Задание 4");
        int i = 5;
        System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        while (i < 31) {
            i = i + 7;
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
    }

    public static void Задание_3_1() {
        System.out.println("Задание 1");
        int currentYear = 2022;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int i = startYear; i < endYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
    public static void Задание_3_2() {
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println("2*" + i + "=" + 2*i);
        }
    }
}
