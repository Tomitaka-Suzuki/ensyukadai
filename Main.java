import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner stdin = new Scanner(System.in);
                double tall,weight,bmi;
                tall = stdin.nextInt();
                weight = stdin.nextInt();
                bmi = 0.0;
		tall = tall / 10;
                bmi = weight / ( tall * tall);
                System.out.println("BMI値は" + bmi);
        }
}

