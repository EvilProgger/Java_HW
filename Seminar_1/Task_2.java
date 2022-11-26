//простые числа от 1 до 1000
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        int count =0;

        System.out.println("Введите верхний предел интервала:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i < n; i++){
            if(isPrime1(i)){
                System.out.print(i+"\t");
                count++;
                if(count%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println("\rКоличество простых чисел\t" + count);
    }
    public static boolean isPrime1(int i){

        boolean t = false;

        if(i==2){
            t = true;
        }

        for(int j = 2;j < i;j++){
            if(j==(i-1)){
                t = true;
            }
            if((i % j)==0){
                break;
            }
        }
        return t;
}
}