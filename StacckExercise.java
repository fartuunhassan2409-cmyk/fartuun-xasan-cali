package assigment;

import java.util.Stack;

public class StacckExercise {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("DataBase");

        System.out.println("Shayga kore: " + stack.peek());

        System.out.println("Shayga la saaray: " + stack.pop());

        System.out.println("Waxyaabaha haray: " + stack);

        System.out.println("Stack ma madhan yahay? " + stack.isEmpty());

        System.out.println("\n--- Dib u Rogista Qoraalka ---");

        String original = "Hello World";
        Stack<Character> charStack = new Stack<>();

        for (char xaraf : original.toCharArray()) {
            charStack.push(xaraf);
        }

        String reversed = "";

        while (!charStack.isEmpty()) {
            reversed += charStack.pop();
        }

        System.out.println("Qoraalka asalka ah: " + original);
        System.out.println("Qoraalka la rogay: " + reversed);

        System.out.println("\n--- Hubinta Qawsaska ---");

        String balanced = "({[()]})";
        String unbalanced = "({[})";

        System.out.println(balanced + " : " + checkBalanced(balanced));
        System.out.println(unbalanced + " : " + checkBalanced(unbalanced));
    }

    public static boolean checkBalanced(String str) {

        Stack<Character> brackets = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                brackets.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (brackets.isEmpty()) {
                    return false;
                }

                char top = brackets.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }
}

