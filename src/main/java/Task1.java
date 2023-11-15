import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number>>>   ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Privet");
        }
        name("vyacheslav");
        int[] arr = {1, 2, 3, 4, 5, 6};
        array(arr);
    }

    public static void name(String name) {
        if (name.equals("Vyacheslav")) {
            System.out.println("Privet");
        } else {
            System.out.println("There is no such name");
        }
    }

    public static void array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                {
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }
}

//
//    task2
//            Дана скобочная последовательность: [((())()(())]]
//            - Можно ли считать эту последовательность правильной?
//            - Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?
//            no.
//            the correct sequence would be as follows:
//            [[((()))()(())]]

//