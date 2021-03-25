import java.util.Scanner;
public class plus { 
   static int a(int n, int nn) {
       int sumTemp = 0; 
        for(int i = 0,b = 0; true; i++) { 
           int sum = 0; 
           int temp = i;
           int temp2;
           while(temp > 0) { 
               temp2 = temp%10;
               sum+=temp2;
               temp/=10;
           }
           if(sum == n) { 
           System.out.println(i); 
           b++;
           }
           if(b >= nn) { 
             break;
           }
           sumTemp = sum;
        }
        return sumTemp;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
     a(sc.nextInt(),sc.nextInt());
     sc.close();
    }
}