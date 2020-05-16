import java.util.Scanner;

class factorial_calculation{
int result=1;
    public static void main(String args[]) throws Exception {
        int number, fact;
        System.out.println("ENter number Here:: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        factorial_calculation p1 = new factorial_calculation();
        fact = p1.recursion(number);
        System.out.println("FActorial of " + number + " is " + fact);

    }

    public int recursion(int num) {

        if (num == 1) {
            return result;
        }
       
        recursion(num - 1);
        result = result * num;
        return result;

    }
}