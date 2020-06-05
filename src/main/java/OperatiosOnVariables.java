import static com.sun.javafx.fxml.expression.Expression.modulo;

public class OperatiosOnVariables {
    public static void main(String[] args) {
        int x = 14;
        int y = 7;
        int modulo = x % y;

        System.out.println(modulo);

        if (modulo == 0){
            System.out.println( "The number 7 is a divisor of the number " + x);
        } else {
            System.out.println( "The number 7 is not a divisor of the number " + x);
        }

    }
}
