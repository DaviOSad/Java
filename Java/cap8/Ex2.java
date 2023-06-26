package cap8;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex2 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0;
        Scanner s = new Scanner(System.in);
        Boolean valida = false;
        while(!valida)
        {
            try
            {
                System.out.println("Insira os dois valores: ");
                n1 = s.nextInt();
                n2 = s.nextInt();
                valida = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Entrada Inválida");
                s.nextLine();
            }
        }
        System.out.println("A soma os inteiros entre eles é: " + calcSoma(n1, n2));

        s.close();
        
    }
    public static int calcSoma (int n1, int n2)
    {
        int soma = 0;
        if(n2>=n1)
        {
            for(int i = n1 + 1; i<n2; i++)
            {
                soma += i;
            }
        }
        else
        {
            for(int i = n2 + 1; i<n1; i++)
            {
                soma += i;
            }
        }
        return soma;
    }
}
