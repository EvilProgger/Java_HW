//Треугольное число
import java.util.Scanner;
public class Task_1_Pyramid {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int n = sc.nextInt();


        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
