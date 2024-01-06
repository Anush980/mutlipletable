import java.util.*;

public class hari {
   static void multi(int n){
        for(int i=1; i<=10; i++){
        System.out.format("%d * %d = %d\n",n,i,n*i);

    }}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want multiplication table of: ");
        int n = sc.nextInt();
      multi(n);
    }
}
