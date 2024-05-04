import java.time.LocalDate;

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

/*--------------------------------------------------------------------------------*/
        String name = "Marie Fardova";
        LocalDate date = LocalDate.now();
        date = LocalDate.of(2024, 05, 03);
        System.out.println(date);
/*--------------------------------------------------------------------------------
        double length = 5.3;
        int lengthInt = (int) length;
// Desetinné číslo 5.3 se převede na celé tak, že se zahodí desetinná část.
// V proměnné bude hodnota 5.
        float width = 10.4f; // Požadujeme hodnotu typu float.
// Převod čísel na text lze provést:
        String lengthAsText1 = String.valueOf(length);
        String lengthAsText2 = ""+length;

     ----------------------------------------------------------------------
        int length = 5;
        double lengthDecimal = length; // Automaticky se převede na desetinné číslo.
        double width = 10; // I tady se provádí konverze z celého čísla na desetinné.
        ----------------------------------------------------------------------*/
    }


    private static void printNumbers1To5() {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        for (int i = 1; i <= 5; i++) System.out.println("i = " + i);
    }


    private static double calculateDiagonal(double a, double b) {

        return Math.sqrt(a*a + b*b);

    }

};