/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        System.out.println("Please Enter A Number to Sum To: ");
        int input = scanner.nextInt();
        for (int i = 0; i <= input; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}
