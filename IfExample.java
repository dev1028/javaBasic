
public class IfExample {
    public static void main(String[] args) {
        int score = 880;
        int num = (int)(Math.random() * 6) + 1; //Math.random()범위 0~1의 값을 가진다.
        
        
        if(score >= 90){
            if(score >= 95){
                System.out.println("점수가 95점 이상 A+입니다.");
            }
            else{
                System.out.println("점수가 90점 이상 A입니다.");
            }            
        } else if(score >= 80){
            if(score >= 85){
                System.out.println("점수가 85점 이상 B+입니다.");
            }else{
                System.out.println("점수가 80점 이상 B입니다.");
            }
            
        } else if(score >= 70){
            System.out.println("점수가 70점 이상 C입니다.");
        }
        else{
            System.out.println("점수가 90점 미만");
        }
        System.out.println("프로그램 종료");
        
    }
}