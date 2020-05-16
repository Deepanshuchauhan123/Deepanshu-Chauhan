import java.util.Scanner;

class narcissistic_number{

 public static void main(String ar[]) {

        int num, test = 0, temp, temp2, next, result = 0, value;
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();
        num = value;
        while (num > 0) {
            test++;
            num = num / 10;
        }
//        System.out.println(test);

        for (int i = value; i > 0; i = i / 10) {
            temp = i % 10;
          
                temp2 = test;
                next = 1;

                while (temp2 > 0) {
                    next = next * temp;
                    temp2--;

                }
                result = result + next;
            

        }
        if(result==value){
            System.out.println("It is a Narcissistic number");
        }else
        {
            System.out.println("It is Not a Narcissistic number");
        }
        
    }
}