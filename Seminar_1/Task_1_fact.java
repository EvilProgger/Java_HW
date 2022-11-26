//Факториал числа n
import java.util.Scanner;

public class Task_1_fact {
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:");

            int n = sc.nextInt();
            int i,fact=1;
            for(i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("Факториал числа "+n+" равен: "+fact);
        }
    }

