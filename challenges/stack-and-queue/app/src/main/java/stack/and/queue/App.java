/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.checkerframework.checker.units.qual.C;

public class App {
    private static  Shelter shelterCat= new Shelter();
    private static  Shelter shelterDog= new Shelter();

    public static void main(String[] args) {

//       Stack<java.io.Serializable> stack= new Stack<>();
//
//       stack.push(111);
//        stack.push(222);
//        stack.push(333);
//        stack.push(444);
//
//        System.out.println(stack.toString()+ " Stack");
////
//        System.out.println(stack.pop());
////        System.out.println(stack.pop());
////        System.out.println(stack.peek());
//
//        System.out.println(stack.toString());

//        System.out.println(stack.isEmpty());

//        Queue<java.io.Serializable> queue=new Queue<>();
//        queue.enqueue(111);
//        queue.enqueue(222);
//        queue.enqueue(333);
//        queue.enqueue(444);
//        System.out.println(queue.toString()+ " Queue");

//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//
//        System.out.println(queue.peek());
//        System.out.println(queue.isEmpty());

//        System.out.println(queue.toString());

//        StackQueuePseudo<java.io.Serializable> stackQueuePseudo= new StackQueuePseudo();
//        stackQueuePseudo.enqueue(111);
//        stackQueuePseudo.enqueue(222);
//        stackQueuePseudo.enqueue(333);
//        stackQueuePseudo.enqueue(444);
//        stackQueuePseudo.enqueue(555);
//        System.out.println(stackQueuePseudo.toStringStack());
//
//        stackQueuePseudo.dequeue();
//        System.out.println(stackQueuePseudo.toStringStack2());

/////////////////////////////////////////////////////////////////////////////////////

//        Dog dog1 = new Dog("dog1");
//        Dog dog2 = new Dog("dog2");
//        Dog dog3 = new Dog("dog3");
//
//        Cat cat1 = new Cat("cat1");
//        Cat cat2 = new Cat("cat2");
//        Cat cat3 = new Cat("cat3");
//
//        shelterDog.enqueue(dog1);
//        shelterCat.enqueue(cat1);
//        shelterDog.enqueue(dog2);
//        shelterCat.enqueue(cat2);
//        shelterDog.enqueue(dog3);
//        shelterCat.enqueue(cat3);
//
//        System.out.println(shelterCat);
//        System.out.println(shelterDog);
//
//        String animalDog1 = shelterDog.dequeue("dog");
//        System.out.println(animalDog1);

        //////////////////////////////////////////////////////////////////

        BracketValidation bracketValidation=new BracketValidation();

        System.out.println(bracketValidation.validateBrackets("{}"));
        System.out.println(bracketValidation.validateBrackets("{}(){}"));
        System.out.println(bracketValidation.validateBrackets("()[[Extra Characters]]"));
        System.out.println(bracketValidation.validateBrackets("(){}[[]]"));
        System.out.println(bracketValidation.validateBrackets("{}{Code}[Fellows](())"));
        System.out.println(bracketValidation.validateBrackets("[({}]"));
        System.out.println(bracketValidation.validateBrackets("[({}]"));
        System.out.println(bracketValidation.validateBrackets("{(})"));
        System.out.println(bracketValidation.validateBrackets("(]("));
    }
}
