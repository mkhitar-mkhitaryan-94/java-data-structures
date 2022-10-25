package stack;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(10);
        List<Integer> list = stack.stream().filter(integer -> integer < 10).collect(Collectors.toList());
        System.out.println(list);


        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());

    }
}
