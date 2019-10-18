package maxItemStack;

import java.util.Stack;

public class MaxItemStack {

    private Stack<Integer> maxStack;
    private Stack<Integer> mainStack;

    public MaxItemStack() {
        this.mainStack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public void push(int item) {
        // push the new item onto the stack
        mainStack.push(item);

        // first item is the same in both stacks
        if (mainStack.size() == 1) {
            maxStack.push(item);
            return;
        }

        // if the item is the largest one so far, insert to stack
        if (item > maxStack.peek()) {
            maxStack.push(item);
        } else {
            // if not largest, duplicate the largest on maxStack
            maxStack.push(maxStack.peek());
        }
    }

    public int pop() {
        maxStack.pop();
        return mainStack.pop();
    }

    public int getMaxItem() {
        return maxStack.peek();
    }
}
