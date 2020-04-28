import java.util.*;

public class WhileScannerExample {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("값[정수]를 입력하세요.");
            int input = scn.nextInt();
            if(input > 0){
                sum += input;
            }else{
                break;
            }
            System.out.println("현재까지 합: " + sum);
        }
        System.out.println("sum: " + sum);
        scn.close();
    }
}