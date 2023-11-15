public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача №1. Объявите переменные типа int, byte, short, long, float, double.");
        int a = 12;
        byte b = 15;
        short c = -345;
        long d = 82374682;
        float e = 5;
        double f = 34.678d;
        System.out.println("Ответ: int = " + a + ", byte = " + b + ", short = " + c + ", long = " + d + ", fload = " + e + ", double = " + f + ".");

        //задача 2
        System.out.println("Задача №2. Инициализируйте переменные, используйте изученные ранее типы переменных.");
        float aA = 27.12f;
        long bB = 987678965549l;
        float cC = 2.786f;
        short dD = 569;
        short eE = -159;
        short fF = 27897;
        byte gG = 67;
        System.out.println("Ответ: fload = " + aA + ", " + cC + "; long = " + bB + "; short = " + dD + ", " + eE + ", " + fF + "; byte = " + gG + ".");

        //Задача 3
        System.out.println("Задача №3. Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса. У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников. Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.");
        byte lyudmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short paper = 480;
        float result1 = paper / (lyudmila + anna + ekaterina);
        System.out.println("Ответ: На каждого ученика рассчитано " + result1 + " листов бумаги");

        //Задача 4
        System.out.println("Задача №4. Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.");
        byte bottle = 16;
        byte time1 = 2;
        byte time2 = 20;
        short time3 = 1440;
        short time4 = 4320;
        int time5 = 43200;
        int result2 = bottle / time1;
        int result3 = result2 * time2;
        int result4 = result2 * time3;
        int result5 = result2 * time4;
        int result6 = result2 * time5;
        System.out.println("Ответ: за 20 минут машина произвела " + result3 + " штук бутылок, за сутки машина произвела " + result4 + " штук бутылок, за 3 дня машина произвела " + result5 + " штук бутылок, за 1 месяц машина произвела " + result6 + " штук бутылок.");

        //Задача5
        System.out.println("Задача №5. На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?");
        byte x = 120;
        byte y = 2;
        byte z = 4;
        float result7 = x / (y + z);
        float result8 = result7 * y;
        float result9 = result7 * z;
        System.out.println("Ответ: В школе, где " + result7 + " классов, нужно " + result8 + " банок белой краски и " + result9 + " банок коричневой краски");

        //задача6
        System.out.println("Задача №6. Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.");
        byte banana = 5;
        byte mBanana = 80;
        short milk = 200;
        byte m1 = 100;
        byte ice = 2;
        byte egg = 4;
        byte m2 = 70;
        byte m3 =105;
        short kg = 1000;
        int resultBanana = banana * mBanana;
        float resultmilk = milk / m1 * m3;
        int resultIce = ice * m1;
        int resultEgg = egg * m2;
        float result10 = resultBanana + resultmilk + resultIce + resultEgg;
        float resultKg = result10 / kg;
        System.out.println("Ответ: Вес спортзавтрака: " + result10 + " г = " + resultKg + " кг.");
        // задача 7
        System.out.println("Задача №7. Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.");
        byte mass = 7;
        byte sr = 2;
        short minMass = 250;
        short maxMass = 500;
        int gMass = mass * kg;
        float minTime = gMass / maxMass;
        float maxTime = gMass / minMass;
        float sMass = (maxMass + minMass) / sr;
        float sTime = gMass / sMass;
        System.out.println("Ответ: спорсмену необходимо от " + minTime + " до " + maxTime + " дней, если будет питаться по среднему рациону, то " + sTime + " дней.");

        //Задача 8
        System.out.println("Задача №7. Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.");
        int moneyMasha = 67760;
        int moneyDenis = 83690;
        int moneyKristina = 76230;
        float procent = 1.1f;
        float moneyMasha1 = moneyMasha * procent;
        float upMasha = moneyMasha1 - moneyMasha;
        float moneyDenis1 = moneyDenis * procent;
        float upDenis = moneyDenis1 - moneyDenis;
        float moneyKristina1 = moneyKristina * procent;
        float upKristina = moneyKristina1 - moneyKristina;
        System.out.println("Ответ:");
        System.out.println("Маша теперь получает " + moneyMasha1 + " рублей. Годовой доход вырос на " + upMasha + " рублей");
        System.out.println("Денис теперь получает " + moneyDenis1 + " рублей. Годовой доход вырос на " + upDenis + " рублей");
        System.out.println("Маша теперь получает " + moneyKristina1 + " рублей. Годовой доход вырос на " + upKristina + " рублей");
    }
}