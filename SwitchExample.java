
public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1; //Math.random()범위 0~1의 값을 가진다.
        switch(num){
            case 1:
                System.out.println("번호 1번 입니다.");
                break;
            case 2:
                System.out.println("번호 2번 입니다.");
                break;
            case 3:
                System.out.println("번호 3번 입니다.");
                break;
            case 4:
                System.out.println("번호 4번 입니다.");
                break;
            case 5:
                System.out.println("번호 5번 입니다.");
                break;
            default:
                System.out.println("번호 6번 입니다.");
                break;
        }
        System.out.println("프로그램 종료");   
    }
}