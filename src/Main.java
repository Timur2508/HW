public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");

        System.out.println("Задача №1");

        int a = 62000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 64;
        System.out.println("Значение переменной b с типом  byte  равно " + b);
        short c = 3274;
        System.out.println("Значение переменной  c с типом  short   равно " + c);
        long d = 540000000L;
        System.out.println("Значение переменной  d с типом  long   равно  " + d);
        float f = 3.7500024f;
        System.out.println("Значение переменной  f с типом   float    равно  " + f);
        double j = 3.57;
        System.out.println("Значение переменной  j с типом  double   равно  " + j);

        System.out.println("Задача № 2");

        int h = 27897;
        System.out.println("Значение переменной h с типом int = " + h);
        byte k = 67;
        System.out.println("Значение переменной k с типом  byte  = " + k);
        short l = 569;
        System.out.println("Значение переменной  l с типом  short   = " + l);
        long m = 987678965549L;
        System.out.println("Значение переменной  m с типом  long   =  " + m);
        float n = 27.12f;
        System.out.println("Значение переменной  n с типом   float    =  " + n);
        double p = 2.786;
        System.out.println("Значение переменной  p с типом  double   =  " + p);
        short q = -159;
        System.out.println("Значение переменной  q с типом  short   = " + q);

        System.out.println("Задача № 3");

        short totalNumberOfSheets = 480;
        byte lyudmilaPavlovnaStudents = 23;
        byte annaSergeevnaStudents = 27;
        byte ekaterinaAndreevnaStudents = 30;
        int totalStudents = lyudmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents;
        int numberOfSheetsForEachStudent = totalNumberOfSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано  " + numberOfSheetsForEachStudent + " листов бумаги");

        System.out.println("Задача № 4");

        byte minutesDayMakingMachine = 20;
        short minutesDayMakingMachine1 = 1440;
        short minutesDayMakingMachine2 = 1440 * 3;
        int minutesDayMakingMachine3 = 1440 * 30;
        byte makingMachineInMinutes = 16 / 2;
        System.out.println("За 1 минуту  машина произвела  " + makingMachineInMinutes + "  штук бутылок");
        int makingMachineIn20Minutes = makingMachineInMinutes * minutesDayMakingMachine;
        System.out.println("За 20 минут машина произвела  " + makingMachineIn20Minutes + " штук бутылок");
        int makingMachineIn1440Minutes = makingMachineInMinutes * minutesDayMakingMachine1;
        System.out.println("За 1440 минут (сутки) машина произвела  " + makingMachineIn1440Minutes + " штук бутылок");
        int makingMachineIn4320Minutes = makingMachineInMinutes * minutesDayMakingMachine2;
        System.out.println("За 4320 минут (3 дня)  машина произвела  " + makingMachineIn4320Minutes + " штук бутылок");
        int makingMachineIn43200Minutes = makingMachineInMinutes * minutesDayMakingMachine3;
        System.out.println("За  43200 минут (30 дней) машина произвела  " + makingMachineIn43200Minutes + " штук бутылок");

        System.out.println("Задача № 5");

        byte paintCansForClasses = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int paintCansPerOneClass = whitePaintPerClass + brownPaintPerClass;
        int numberOfClasses = paintCansForClasses / paintCansPerOneClass;
        int whitePaintForAllClasses = numberOfClasses * whitePaintPerClass;
        int brownPaintForAllClasses = numberOfClasses * brownPaintPerClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintForAllClasses + " банок белой краски и " + brownPaintForAllClasses + " банок коричневой краски");

        System.out.println("Задача № 6");

        byte bananas = 5;
        byte gramsInOneBanana = 80;

        short milk = 200;
        byte halfServingOfMilk = 100;
        byte gramsIn100MillilitersOfMilk = 105;
        int amountOfMilkNeeded = milk / halfServingOfMilk;

        Byte iceCreamBriquettes = 2;
        Byte oneBriquetteOfFrozenGrams = 100;

        Byte rawEggs = 4;
        Byte numberOfGramsInOneRawEgg = 70;

        int numberOfGramsInFiveBananas = bananas * gramsInOneBanana;
        int numberOfGramsIn200MlOfMilk = amountOfMilkNeeded * gramsIn100MillilitersOfMilk;
        int numberOfGramsIn2IceCreamBriquettes = iceCreamBriquettes * oneBriquetteOfFrozenGrams;
        int numberOfGramsIn4RawEggs = rawEggs * numberOfGramsInOneRawEgg;
        int totalGramsInBreakfast = numberOfGramsInFiveBananas + numberOfGramsIn200MlOfMilk + numberOfGramsIn2IceCreamBriquettes + numberOfGramsIn4RawEggs;
        float totalGramInKg = 1000f;

        float totalKgInBreakfast = totalGramsInBreakfast / totalGramInKg;
        System.out.println("Вес (количество граммов) такого спортзавтрака составляет " + totalGramsInBreakfast + " граммов");
        System.out.println("Вес (количество килограммов) такого спортзавтрака составляет " + totalKgInBreakfast + " килограмм");

        System.out.println("Задача № 7");

        byte totalNumberOfKgForWeightLoss = 7;
        short totalNumberOfGramsInKilogram = 1000;
        int totalGramsForWeightLoss = 7 * 1000;
        short firstWayToLoseWeight = 250;
        short secondWayToLoseWeight = 500;
        int numberOfDaysWithTheFirstMethodOfLosingWeight = totalGramsForWeightLoss / firstWayToLoseWeight;
        int numberOfDaysWithTheSecondMethodOfLosingWeight = totalGramsForWeightLoss / secondWayToLoseWeight;
        System.out.println(numberOfDaysWithTheFirstMethodOfLosingWeight + "  дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(numberOfDaysWithTheSecondMethodOfLosingWeight + " дней уйдет на похудение, если спортсмен каждый день будет худеть на 500 грамм");

        byte numberOfWaysToLoseWeight = 2;
        int sumOfDaysForCalculatingTheArithmeticMean = numberOfDaysWithTheFirstMethodOfLosingWeight + numberOfDaysWithTheSecondMethodOfLosingWeight;
        int numberOfDaysToLoseWeightOnAverage = sumOfDaysForCalculatingTheArithmeticMean / numberOfWaysToLoseWeight;
        System.out.println(numberOfDaysToLoseWeightOnAverage + " дней уйдет на похудение в среднем");

        System.out.println("Задача № 8");

        int mashaCurrentSalaryPerMonth = 67760;
        int denisSalaryCurrentPerMonth = 83690;
        int christinaSalaryCurrentPerMonth = 76230;

        float salaryIncreasePercentage = 10 / 100f;
        float amountOf10PercentOfMashaCurrentSalary = mashaCurrentSalaryPerMonth * salaryIncreasePercentage;
        float amountOf10PercentOfDenisCurrentSalary = denisSalaryCurrentPerMonth * salaryIncreasePercentage;
        float amountOf10PercentOfChristinaCurrentSalary = christinaSalaryCurrentPerMonth * salaryIncreasePercentage;
        System.out.println("Сумма 10% от месячной зарплаты сотрудников: Маши, Дениса, Кристины соответсвенно");
        System.out.println(amountOf10PercentOfMashaCurrentSalary);
        System.out.println(amountOf10PercentOfDenisCurrentSalary);
        System.out.println(amountOf10PercentOfChristinaCurrentSalary);

        float mashaSalaryPerMonthAfterTheIncrease = mashaCurrentSalaryPerMonth + amountOf10PercentOfMashaCurrentSalary;
        float denisSalaryPerMonthAfterTheIncrease = denisSalaryCurrentPerMonth + amountOf10PercentOfDenisCurrentSalary;
        float christinaSalaryPerMonthAfterTheIncrease = christinaSalaryCurrentPerMonth + amountOf10PercentOfChristinaCurrentSalary;
        System.out.println("Месячная зарплата сотрудников после повышения: Маши, Дениса, Кристины соответсвенно");
        System.out.println(mashaSalaryPerMonthAfterTheIncrease);
        System.out.println(denisSalaryPerMonthAfterTheIncrease);
        System.out.println(christinaSalaryPerMonthAfterTheIncrease);

        byte month = 12;
        double annualIncomeOfMashaAfterTheIncrease = mashaSalaryPerMonthAfterTheIncrease * month;
        double annualIncomeOfDenisAfterTheIncrease = denisSalaryPerMonthAfterTheIncrease * month;
        double annualIncomeOfChristinaAfterTheIncrease = christinaSalaryPerMonthAfterTheIncrease * month;
        System.out.println("Годовая зарплата сотрудников после повышения: Маши, Дениса, Кристины соответсвенно");
        System.out.println(annualIncomeOfMashaAfterTheIncrease);
        System.out.println(annualIncomeOfDenisAfterTheIncrease);
        System.out.println(annualIncomeOfChristinaAfterTheIncrease);

        int mashaAnnualIncomeBeforeTheIncrease = mashaCurrentSalaryPerMonth * month;
        int denisAnnualIncomeBeforeTheIncrease = denisSalaryCurrentPerMonth * month;
        int christinaAnnualIncomeBeforeTheIncrease = christinaSalaryCurrentPerMonth * month;
        System.out.println("Годовая зарплата сотрудников до повышения: Маши, Дениса, Кристины соответсвенно");
        System.out.println(mashaAnnualIncomeBeforeTheIncrease);
        System.out.println(denisAnnualIncomeBeforeTheIncrease);
        System.out.println(christinaAnnualIncomeBeforeTheIncrease);

        System.out.println("Разница между годовыми зарплатами сотрудников до повышения и после: Маши, Дениса, Кристины соответсвенно");
        double differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter = annualIncomeOfMashaAfterTheIncrease - mashaAnnualIncomeBeforeTheIncrease;
        double differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter = annualIncomeOfDenisAfterTheIncrease - denisAnnualIncomeBeforeTheIncrease;
        double differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter = annualIncomeOfChristinaAfterTheIncrease - christinaAnnualIncomeBeforeTheIncrease;
        System.out.println(differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter);
        System.out.println(differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter);
        System.out.println(differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter);

        System.out.println("Маша теперь получает " + mashaSalaryPerMonthAfterTheIncrease + " рублей в месяц. " + "Годовой доход вырос на " + differenceBetweenMashaAnnualSalaryBeforeThePromotionAndAfter + " рублей. ");
        System.out.println("Денис теперь получает " + denisSalaryPerMonthAfterTheIncrease + " рублей в месяц. " + "Годовой доход вырос на " + differenceBetweenDenisAnnualSalaryBeforeThePromotionAndAfter + " рублей.");
        System.out.println("Кристина теперь получает " + christinaSalaryPerMonthAfterTheIncrease + " рублей в месяц. " + "Годовой доход вырос на " + differenceBetweenChristinaAnnualSalaryBeforeThePromotionAndAfter + " рублей.");
    }
}