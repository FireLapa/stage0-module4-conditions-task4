package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int com;
        int res;
        com = first >= second ?
                +first:
                +second;
        res = com >= third ?
                +com:
                +third;
        System.out.println(res);
    }
}
