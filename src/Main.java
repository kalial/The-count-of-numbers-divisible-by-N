import java.util.Scanner;

/*
The for-loop  The count of numbers divisible by N
Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.
Note: it is possible to write this program more efficiently without any loops.
Sample Input 1:
10 20 10
Sample Output 1:
2
Sample Input 2:
15 25 5
Sample Output 2:
3
 so if you have the numbers a=15, b=25 & n=5 given, your program should check how many numbers between 15 and 25 are divisible by 5 --> in this case it's 3 numbers of course (--> 15, 20, 25)

 */
public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();

        int output = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                output++;
            }
        }
        System.out.println(output);
//        int number = (b - a) / n;
//        System.out.println(number + 1);
    }
}
