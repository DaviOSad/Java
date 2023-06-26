package cap5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        float sal = 0;
        short ano = 0;
        float aumento = (float)1.5/100;
        Boolean valida = false;
        Scanner scanner = new Scanner(System.in);
        
        while(!valida)
        {
            try{
                System.out.println("Insira o salario e o ano atual: ");
                sal = scanner.nextFloat();
                ano = scanner.nextShort();
                valida = true;
            } catch (InputMismatchException e)
            {
                System.out.println("Entrada Inválida.");
                scanner.nextLine();
            }
        }

        for (int i = 2006; i <= ano; i ++)
        {
            sal += (sal*aumento);
            aumento *= 2;
        }

        System.out.println("Novo salario: R$"+sal);
        scanner.close();
    }
    
}
