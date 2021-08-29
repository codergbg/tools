import java.util.Random;
import java.util.Scanner;

/**
 * @author gubengang
 * @create Test-06-16 21:54
 */
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = new Random().nextInt(100);
        int time = 0;
        while(sc.hasNext()){
            time++;
            if(time>3){
                System.out.println("竞猜失败，超出3次了！");
                break;
            }
            int n = sc.nextInt();
            if(n==num){
                System.out.println("恭喜你答对了！");
                break;
            }else if(n<num){
                System.out.println("你猜小了！");
            }else{
                System.out.println("你猜大了！");
            }
        }
    }
}
