
public class IfNestedExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1; //Math.random()범위 0~1의 값을 가진다.
        
        if(num == 1){
            System.out.println("번호 1번 입니다.");
        } else if(num == 2){
            System.out.println("번호 2번 입니다.");
        } else if(num == 3){
            System.out.println("번호 3번 입니다.");
        } else if(num == 4){
            System.out.println("번호 4번 입니다.");
        } else if(num == 5){
            System.out.println("번호 5번 입니다.");
        } else {
            System.out.println("번호 6번 입니다.");
        }
        System.out.println("프로그램 종료");
        
    }
}

