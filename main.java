import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int n,max=0,min=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n= input.nextInt();
        System.out.print("1.Sayıyı giriniz :");
        int s=input.nextInt();
        for(int i=2;i<=n;i++){
            System.out.print(i+" .sayıyı giriniz : ");
            int b=input.nextInt();
            if(s<b) {
                max = b;
            }else
                min = b;
        }
        System.out.println("en büyük sayı : "+ max);
        System.out.println("en küçük sayı :"+ min);

       /*
        do{
            System.out.print(i+" sayıyı giriniz : ");
            int b=input.nextInt();
            i++;
            if(b<)
        }while (i<=n)*/

    }
}
