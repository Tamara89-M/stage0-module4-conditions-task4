package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        String bigger = first > second? "first": "second";
        System.out.println(bigger);
    }

    public static void main(String[] args) {
        TernaryPrinter t = new TernaryPrinter();
        t.printWhichIsBigger(1,12);
    }
}
