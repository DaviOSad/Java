package cap6;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        int vetor[];
        vetor = new int[9];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 9; i++)
        {
            System.out.println("Insira o valor " + i);
            vetor[i] = s.nextInt();
        }

        for (int i = 0; i < 9; i++)
        {
            if (primo(vetor[i]))
            {
                System.out.println("Primo: " + vetor[i] + "Posição: " + i);
            }

        }


        s.close();
    }

    public static boolean primo (int numero)
    {
        short div = 0;
        for (int i = 1; i < numero; i++)
        {
            if (numero % i == 0) div++;
        }
        if (div == 2) return true;
        else return false;
    }
}