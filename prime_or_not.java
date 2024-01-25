import java.util.Scanner;
public class prime_or_not {
    public static void main(String[] args){
        int counter=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num1=scan.nextInt();
        if(num1>1){
            for(int i=1;i<=num1;i++){
                if(num1%i==0){
                    counter++;
                }     
            }
            if(counter==2){
              System.out.println("the number is prime b/c it has no divider except 1 and itself");
            }      else{
                    System.out.println("the number is not prime"); 
                }
            
        }
    }
}