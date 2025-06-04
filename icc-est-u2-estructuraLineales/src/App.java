//import controllers.Stack;


//import controllers.Stacks;

import Models.Persona;
import controllers.Queue;
import controllers.QueueG;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
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
        */
        /* 
        Stacks<Integer> stacks = new Stacks<>();
        stacks.push(10);
        stacks.push(-1);
        stacks.push(5);
        stacks.push(8);
        

        System.out.print("Tam= " + stacks.size());
        stacks.printStacks();
        stacks.pop();
        System.out.print("Tam=" +stacks.size());
        stacks.printStacks();
        */
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");
        QueueG<Persona> colaPersonas = new QueueG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        colaPersonas.printCola();
        System.out.println("Persona atemdida ->" + colaPersonas.remove());
        colaPersonas.printCola();
        Persona pB = colaPersonas.findByName("Juan");
        System.out.println("Persona encontrada -> " + pB !=null ? pB: "ninguan");
        Persona pE = colaPersonas.deleteByName("Pedro");
        System.out.println("Persona eliminada- > "+ pE !=null? pE: "eliminada");
        colaPersonas.printCola();


        
        
    }
}
