package cap6;
import java.util.Scanner;

public class Ex3{
   public static void main(String[] args) {
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorRes[] = new int[20];
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i<10; i++)
        {
            System.out.println("Insira o valor da posição " + (i+1) + " do primeiro vetor");
            vetor1[i] = s.nextInt();
        }
        for (int i = 0; i<10; i++)
        {
            System.out.println("Insira o valor da posição " + (i+1) + " do segundo vetor");
            vetor2[i] = s.nextInt();
        }
        for(int i = 0; i<10; i++)
        {
            vetorRes[2*i] = vetor1[i];
            vetorRes[2*i+1] = vetor2[i];
        }

        for(int i = 0; i<20; i++)
        {
            System.out.println("Posição " + i + ": " + vetorRes[i]);
        }

        s.close();
   } 
}