public class Main {
    public static void main(String[] args) {
        //задача 1
        int apples = 12;
        System.out.println("Значение переменной с типом int = " + apples);
        byte cats = 16;
        System.out.println("Значение переменной с типом byte = " + cats);
        short dogs = 32;
        System.out.println("Значение переменной с типом short = " + dogs);
        long pressure = 32768;
        System.out.println("Значение переменной с типом long = " + pressure);
        float cars = 2.2345F;
        System.out.println("Значение переменной с типом float = " + cars);
        double stars = 3.42346346;
        System.out.println("Значение переменной с типом double = " + stars);
        System.out.println();

        //Задача 2
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786F;
        int d = 569;
        short e = -159;
        char f = 27897;
        byte g = 67;

        //Задача 3
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short totalPaper = 480;
        //выясним общее количество учеников
        int students = class1 + class2 + class3;
        int paperForPerson = totalPaper / students;
        System.out.println("На каждого ученика расчитано " + paperForPerson + " листов бумаги");
        System.out.println();

        //Задача 4
        short productivity2Minutes = 16;
        int productivity1Minutes = productivity2Minutes / 2;
        int productivity20Minutes = productivity1Minutes * 20;
        System.out.println("За 20 минут машина произвела " + productivity20Minutes + " штук бутылок");
        //посчитаем количество минут в сутках
        int minutesInDay = 24 * 60;
        int productivityDay = minutesInDay * productivity1Minutes;
        System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок");
        long productivity3Days = productivityDay * 3;
        System.out.println("За 3 дня машина произвела " + productivity3Days + " штук бутылок");
        long productivityMonth = productivityDay * 30;
        System.out.println("За месяц машина произвела " + productivityMonth + " штук бутылок");
        System.out.println();

        //Задача 5
        short paints = 120;
        short whitePaint = 2;
        short brownPaint = 4;
        int amountOfClass = paints / (whitePaint + brownPaint);
        int amountWhitePaint = whitePaint * amountOfClass;
        int amountBrownPaint = brownPaint * amountOfClass;
        System.out.println("В школе, где " + amountOfClass + " классов, нужно " + amountWhitePaint + " банок белой краски и " + amountBrownPaint + " банок коричневой краски");
        System.out.println();

        //Задача 6
        short bananas = 5;
        short milk = 2;
        short iceCream = 2;
        short eggs = 4;
        short weight1Banana = 80;
        short weight1Milk = 105;
        short weight1IceCream = 100;
        short weight1Eggs = 70;
        int totalWeightG = bananas * weight1Banana + weight1Milk * milk + iceCream * weight1IceCream + eggs * weight1Eggs;
        float totalWeightKG = (float) totalWeightG / 1000;
        System.out.println("Вес спортзавтрака " + totalWeightG + " грамм, или " + totalWeightKG + " килограмм");
        System.out.println();

        //Задача 7
        short totalWeight = 7000;
        short weightLossMin = 250;
        short weightLossMax = 500;
        float slowlyWeightLoss =(float) totalWeight / weightLossMin;
        System.out.println(slowlyWeightLoss + " дней уйдет на похудение, если спортсмен будет терять по 250 грамм в день");
        float fastWeightLoss =(float) totalWeight / weightLossMax;
        System.out.println(fastWeightLoss + " дней уйдет на похудение, если спортсмен будет терять по 500 грамм в день");
        float averageLossWeight = (float) (weightLossMax + weightLossMin) / 2;
        float averageDaysLossWeight = (float) totalWeight / averageLossWeight;
        System.out.println(averageDaysLossWeight + " потребуется дней в среднем, чтобы добиться результата");
        System.out.println();


        //Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float salaryIncreaseMasha = masha * 1.1F;
        float salaryIncreaseDenis = denis * 1.1F;
        float salaryIncreaseKristina = kristina * 1.1F;
        float yearIncomeMashaBefore = masha * 12;
        float yearIncomeMashaAfter = salaryIncreaseMasha * 12;
        float yearIncomeDenisBefore = denis * 12;
        float yearIncomeDenisAfter = salaryIncreaseDenis * 12;
        float yearIncomeKristinaBefore = kristina * 12;
        float yearIncomeKristinaAfter = salaryIncreaseKristina * 12;
        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей. Годовой доход вырос на " + (yearIncomeMashaAfter - yearIncomeMashaBefore));
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей. Годовой доход вырос на " + (yearIncomeDenisAfter - yearIncomeDenisBefore));
        System.out.println("Кристина теперь получает " + salaryIncreaseKristina + " рублей. Годовой доход вырос на " + (yearIncomeKristinaAfter - yearIncomeKristinaBefore));

    }
}