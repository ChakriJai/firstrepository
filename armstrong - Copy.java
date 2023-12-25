import java.util.Scanner;

public class armstrong {
    public static void main(String arr[]){
        Scanner scr= new Scanner(System.in);
        int n = scr.nextInt();
        int temp,armstrong=0;
        int orginal=n;
        while(n>0){
            temp=n%10;
            temp=temp*temp*temp;
            armstrong=armstrong+temp;
            n=n/10;
        }
        if(orginal==armstrong){
            System.out.println("it is armstrong");
        }
    }
}
