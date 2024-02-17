import java.util.Scanner;
class calculate {
    int x;
    int a;
    int b;


    calculate(int x) {
        this.x = x;

    }

    calculate(int a, int b) {
        this.a = a;
        this.b = b;

    }

    calculate(int a, int b, int x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public void Calc1(int x){
        int result = 3 * x + 5;
        System.out.printf("3 * %d + 5 = %d", x, result);
        
    }

    public void Calc2(int a, int b){
        if (a == b){
            System.out.println("На ноль делить нельзя");
            return;
        }
        int result = (a + b)/ (a - b);
        System.out.printf("%d + %d/ %d - %d = %d", a, b, a, b, result);
    }

    public void Calc3(int a, int b, int x){
        if (b == 0){
            System.out.println("На ноль делить нельзя");
            return;
        }
        int res0 = (a * x) / b;
        int result = 1;
        for (int i = 1; i <= res0; i++) {
            result = result * i;
        }
        System.out.println(result);

    }






}

    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введи значение x1: ");
            int x1 = input.nextInt();
            calculate n1 = new calculate(x1);
            n1.Calc1(x1);
            System.out.println();


            System.out.print("Введи значение a1: ");
            int a1 = input.nextInt();
            System.out.print("Введи значение b1: ");
            int b1 = input.nextInt();
            calculate n2 = new calculate(a1, b1);
            n2.Calc2(a1, b1);
            System.out.println();


            System.out.print("Введи значение a2: ");
            int a2 = input.nextInt();
            System.out.print("Введи значение b2: ");
            int b2 = input.nextInt();
            System.out.print("Введи значение x2: ");
            int x2 = input.nextInt();
            calculate n3 = new calculate(a2, b2, x2);
            n3.Calc3(a2, b2, x2);


            
          

        }
    }
