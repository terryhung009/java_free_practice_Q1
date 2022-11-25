import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.SQLOutput;

public class Main {
    /**定義：質數為
     *
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.print("請輸入要檢查是否為質數的數字n； (輸入 0 結束)");
            String str = br.readLine();
            int num = Integer.parseInt(str);
            if(num == 0){
                break;
            }
            boolean isPrime = true;
            double range = num/2.0;

            for(int i =2; i<=range; i++){
                if((num % i ) == 0){
                    if(isPrime == true){
                        isPrime = false;
                        System.out.print(num+" 不是質數，可以被" + i );
                    }
                    else{
                        System.out.println(" " + i);
                    }
                }
            }

            if( isPrime == true){
                System.out.println(num + " 是質數");
            }else {
                System.out.println("  整除");
            }


        }







    }
}