import controllers.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println(" Tam = " + stack.size());
        //System.out.println("Stack after pushing 10, -1, 5, 8: " + stack);
        //System.out.println( stack.pop());
        //System.out.println( stack.peek());
        stack.printSrack();
        stack.pop();
         System.out.println("Tam = " + stack.size());
        stack.printSrack();
        
        
        
    }
}
