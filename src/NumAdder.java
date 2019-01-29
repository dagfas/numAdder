import java.util.Scanner;



    public class NumAdder {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your first number");

            int input1 = scanner.nextInt();
            //System.out.println(input1);

            System.out.println("Please enter your second number");
            int input2 = scanner.nextInt();
            //System.out.println(input2);

            System.out.println("Please enter your third integer");
            int input3 = scanner.nextInt();

            int total = input1 + input2 + input3;
            System.out.println("Your total is " + total);


            // new comment
        }

}
