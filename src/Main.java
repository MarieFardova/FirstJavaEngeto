//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        printNumbers1To5();

        double a = 3.7;
        double b = 4.1;
        System.out.println("Úhlopříčka trojúhelníku je: " + calculateDiagonal(a,b));

        double c;
        c = calculateDiagonal(5,6);
        System.out.println("Úhlopříčka trojúhelníku je:  " + c);
    }


    private static void printNumbers1To5() {
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }


    private static double calculateDiagonal(double a, double b) {

        return Math.sqrt(a*a + b*b);

    }

};