import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển: ");
        int number = sc.nextInt();
        int temp;
        Stack<Integer> stack = new Stack<>();
        System.out.print("Ban đầu: " + number);
        System.out.print("\nChuyển thành nhị phân: ");
        while (number != 0) {
            temp = number % 2;
            stack.push(temp);
            number = number / 2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
