package cap8;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex1 {
    public static void main(String[] args) {
        long N = 0;
        int posOuNeg;
        Scanner s = new Scanner(System.in);
        Boolean valida = false;
        while(!valida)
        {
            try {
                System.out.println("Insira um valor: ");
                N = s.nextLong();
                valida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada Inválida.");
                s.nextLine();
            }
        }
        posOuNeg = posNeg(N);
        if(posOuNeg == 1) System.out.println("Positivo");
        else System.out.println("Negativo");

        s.close();
    }
    public static int posNeg (long N){
        if (N>=0) return 1;
        else return 0;
    }
}
