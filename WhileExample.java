
public class WhileExample {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=5; ++i){
            sum += i;
        }

        sum = 0;
        int i = 1;
        while(i <= 100){
            if(i % 2 != 0)
            {
                sum += i;
            }
            ++i;
        }
    }
}