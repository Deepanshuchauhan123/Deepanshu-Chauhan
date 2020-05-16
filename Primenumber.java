import java.util.Scanner;

class Primenumber{

public static void main(String ar[]) {

        int start, end, result = 0, test;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting of range of number for prime number: ");
        start = sc.nextInt();
System.out.println("Enter ending of range of number for prime number: ");
     
        end = sc.nextInt();

        for (int i = start; i < end; i++) {
            test = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    test++;
                    if (test > 1) {
                        break;
                    }
                }

            
            }
            
            if(test==1){
                result++;
            }

        }
	System.out.println("Total prime numbers are: "+result);
        
    }
}