package cap6;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        int vetor[] = new int[8];
        int positivo[] = new int[8];
        int negativo[] = new int [8];
        int pos1 = 0, pos2 = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i<8; i ++)
        {
            vetor[i] = s.nextInt();
            if (vetor[i] >= 0) 
            {
                positivo[pos1] = vetor[i];
                pos1 ++;
            }
            else 
            {
                negativo[pos2] = vetor[i];
                pos2 ++;
            }
        }

        if (pos1 > 0)
        {
            System.out.print("Vetor positivos: ");
            for(int i = 0; i < pos1; i++)
            {
                System.out.print(positivo[i] + " ");
            }
        }
        else System.out.println("Vetor positivos vazio.");
        if (pos2 > 0)
        {
            System.out.print("\nVetor negativos: ");
            for(int i = 0; i < pos2; i++)
            {
                System.out.print(negativo[i] + " ");
            }
        }
        else System.out.println("\nVetor negativos vazio.");
        s.close();
    }
}
