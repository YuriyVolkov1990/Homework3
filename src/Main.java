public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int i = 1;
        System.out.println("Значение переменной i с типом integer равно " + i);
        byte b = 2;
        System.out.println("Значение переменной i с типом byte равно " + b);
        short s = 3;
        System.out.println("Значение переменной s с типом short равно " + s);
        long l = 4;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 5;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 6;
        System.out.println("Значение переменной d с типом double равно " + d);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float f = 27.12f;
        System.out.println(f);
        long l = 987678965549L;
        System.out.println(l);
        double d = 2.786;
        System.out.println(d);
        short s = 569;
        System.out.println(s);
        short s1 = -159;
        System.out.println(s1);
        short s2 = 27897;
        System.out.println(s2);
        byte b = 67;
        System.out.println(b);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte l = 23;
        byte a = 27;
        byte e = 30;
        short p = 480;
        byte ip = (byte) (p / (l + a + e));
        System.out.println("На каждого ученика рассчитано " + ip + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte b = 16;
        short s = (short) (b * 10);
        System.out.println("За 20 минут машина произвела " + s + " штук бутылок");
        short ps = 24 * 60 / 2;
        short s1 = (short) (ps * b);
        System.out.println("За сутки машина произвела " + s1 + " штук бутылок");
        ps = 24 * 3 * 60 / 2;
        int s2 = ps * b;
        System.out.println("За 3 дня машина произвела " + s2 + " штук бутылок");
        ps = 24 * 31 * 60 / 2;
        int s3 = ps * b;
        System.out.println("За 3 дня машина произвела " + s3 + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte b = 120;
        byte bw = 2;
        byte bb = 4;
        byte nc = (byte)(b/(bw + bb));
        byte bwt = (byte) (nc*bw);
        byte bbt = (byte) (nc*bb);
        System.out.println("В школе, где " + nc + " классов, нужно " + bwt + " банок белой краски и " + bbt + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte weightBanana = 80;
        short milkVolume = 200;
        byte milkWeight = 105;
        byte numberIceCream = 2;
        byte weightIceCream = 100;
        byte egg = 4;
        byte weightEgg = 70;
        short totalWeightGram = (short) (bananas*weightBanana + milkVolume/100*milkWeight + numberIceCream*weightIceCream + egg*weightEgg);
        float totalWeightKilo = totalWeightGram/1000f;
        System.out.println(totalWeightGram);
        System.out.println(totalWeightKilo);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short weight = 7000;
        short looseWeightMin = 250;
        short looseWeightMax = 500;
        byte daysMax = (byte) (weight/looseWeightMin);
        System.out.println("Минимум " + daysMax + " дней");
        byte daysMin = (byte) (weight/looseWeightMax);
        System.out.println("Максимум " + daysMin + " дней");
        byte middleDays = (byte) ((daysMax + daysMin)/2);
        System.out.println("В среднем " + middleDays + " дней");
    }
}