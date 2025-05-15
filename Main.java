import java.util.Scanner;

class Main {
    public static int y(int m, int c){
        int i = 1;
        while(((m*i) - 1) % c != 0){
            i++;
        }
        return(i);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m1, m2, m3, a1, a2, a3, y1, y2, y3;
        
        System.out.println("Enter a1 (x = a mod b)");
        a1 = scan.nextInt();
        System.out.println("Enter b1");
        int t1 = scan.nextInt();
        
        System.out.println("Enter a2");
        a2 = scan.nextInt();
        System.out.println("Enter b2");
        int t2 = scan.nextInt();
        
        System.out.println("Enter a3");
        a3 = scan.nextInt();
        System.out.println("Enter b3");
        int t3 = scan.nextInt();
        
        int M = t1*t2*t3;
        m1 = t2*t3;
        m2 = t1*t3;
        m3 = t1*t2;
        
        y1 = y(m1,t1);
        y2 = y(m2,t2);
        y3 = y(m3,t3);
        
        int mod = (m1*a1*y1)+(m2*a2*y2)+(m3*a3*y3);
        mod = mod % M;
        
        System.out.println("x = " + mod + " (mod " + M + ")");
    }
}
