public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task3_1();
        task3_2();
    }



    private static void task1() {
        int salary = 29000;
        double percent = 0.01;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total += salary + total*percent;
            month++;
            System.out.println("Месяц "+ month + " сумма накоплений " + total+ " рублей");
        }
    }

    private static void task2() {
        String listOfNumbers = "";
        int number = 1;
        while (number <= 10) {
            listOfNumbers += " "+number;
            number++;
        }
        System.out.println(listOfNumbers);

        listOfNumbers = "";
        for (int i =10; i>= 1; i--) {
            listOfNumbers+= " " + i;
        }
        System.out.println(listOfNumbers);


    }
    private static void task3() {
        int population = 12_000_000;
        double fertilityPer1000 = 17;
        double mortalityPer1000 = 8;
        double newPopulation = population;
        for (int i = 1; i <11; i++) {
            newPopulation+= (fertilityPer1000/1000)* newPopulation -(mortalityPer1000/1000)*newPopulation;
            System.out.println("Год "+i+"  численность населения составляет "+newPopulation );
        }
    }


    private static void task2_1() {
       double percent = 0.07;
       int contribution = 15000;
       double sum = contribution;
       int month = 1;
       while (sum < 12_000_000) {
           sum += sum * (percent);
           month++;
           System.out.println("Месяц " + month + " сумма накоплений " + sum + " рублей");
       }

    }

    private static void task2_2() {
        double percent = 0.07;
        int contribution = 15000;
        double sum = contribution;
        int month = 1;
        while (sum < 12_000_000) {
            sum += sum * (percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + sum + " рублей");
            }
            month++;
        }
        }
    private static void task2_3() {
        double percent = 0.07;
        int contribution = 15000;
        double sum = contribution;
        int month = 1;
        while (month <= 12*9) {
            sum += sum * (percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + sum + " рублей");
            }
            month++;
        }
    }


    private static void task2_4() {

        int numberOfFriday = 2;
        for (int i = numberOfFriday; i <=31; i+=7) {
            System.out.println("Сегодня пятница, " +i+"-е число. Необходимо подготовить отчет.");
        }
    }

    private static void task3_1() {
        int start = 1822;
        int finish = 2122;
        int current = start;
        while ( current>=start && current<=finish) {
            if (current%79==0) {
                System.out.println(current);
            }
            current++;
        }

    }
    private static void task3_2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*"+i+"="+2*i);
        }
    }


}