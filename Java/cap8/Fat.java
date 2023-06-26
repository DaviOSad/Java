package cap8;

public class Fat {
    public static int fatorial (int N){
        int fat = 1;
        for (int i = N; i>1; i--)
        {
            fat *= i;
        }
        return fat;
    }
}
