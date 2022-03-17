import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner stdin = new Scanner(System.in);
                double tall,weight,bmi,cnt;
		cnt = 0;
		while( cnt < 2 ){
                	tall = stdin.nextInt();
                	weight = stdin.nextInt();
                	bmi = 0.0;
			tall = tall / 100;
                	bmi = weight / ( tall * tall);
			bmi = ((double)Math.round(bmi * 10))/10;
                	System.out.println("BMI値は" + bmi);
			cnt = cnt + 1;
		}
        }
}

