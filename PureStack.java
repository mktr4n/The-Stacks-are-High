
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * A brief description of this class...
 *
 * @author Khanh My Tran
 */

//package packageName

//import java.xxxxx.*;

public class PureStack<E extends Object> {
    private ArrayList<E> myList;

    public PureStack() {
        this.myList = new ArrayList<E>();
    }

    /**
     * @push Add an item on top of the stack
     */
    public void push(E item) {
        this.myList.add(0,item);
    }

    /**
     * @pop Removes the object at the top of this stack and returns that
     * object as the value of this function.
     */
    public E pop() {
        if (this.myList.isEmpty()) {
            throw new NoSuchElementException("Use a better string than this.");
        } else {
            //return myList.remove(myList.size() - 1);
            E temp = myList.get(0);
            myList.remove(0);
            return temp;
        }
    }

    /**
     * @peek Looks at the object at the top of this stack without removing it
     * from the stack
     */
    public E peek() {
        if (this.myList == null) {
            throw new EmptyStackException();
        } else {
            return this.myList.get(0);
        }
    }
    /**
     * Returns: true if and only if this stack contains no items; false other
     * wise.
     *
     * @isEmpty A String description of this.
     */
    public boolean isEmpty() {
        return this.myList.isEmpty();
    }
    /**
     * Returns: true if this stack is equal to another stack otherwise; false
     * otherwise.
     *
     *
     * @equals A String description of this.
     */
    public boolean equals(PureStack beluga){
        return this.myList.equals(beluga.myList);
    }

    /**
     * Returns a String version of this.
     *
     * @return A String description of this.
     */
    public String toString() {
        return "Top-->" + this.myList + "<--Bottom";
    }


    /* hidden methods (private/protected) (JavaDoc not necessary) */

    /* main method for testing */

    /**
     * Unit test for PureStack
     *
     * @param args Arguments used to test this class.
     */
    public static void main(String[] args) {
        PureStack<String> stringStack = new PureStack<String>();
        PureStack<String> beluga = new PureStack<String>();
        stringStack.push("Hi");
        stringStack.push("yo");
        stringStack.push("Animal!");

        beluga.push("Hi");
        beluga.push("yo");
        beluga.push("Animal!");

        System.out.println(stringStack);
        System.out.println(stringStack.toString());
        System.out.println(stringStack.peek());
        System.out.println(stringStack);
        System.out.println("Are they equal? " + stringStack.equals(beluga));
        // System.out.println("Is it empty? " + stringStack.isEmpty());
        // System.out.println("What is the top element? " + stringStack.peek());*/
       /*PureStack<String> alpacas = new PureStack<String>();
       alpacas.push("T");
        //System.out.println(alpacas);
        boolean isCorrect;
        boolean allCorrect = true;
        String success = "Test completed successfully!";
        String failure = "Something went wrong!!!!!!!!!!!!";
        try {
            alpacas.pop();
           // System.out.println(alpacas);
            //if the code reaches this point, the exception didn't get thrown!
            isCorrect = false;
        } catch (NoSuchElementException e) {
            //the exception was thrown; the method worked correctly!
            isCorrect = true;
        }
        System.out.println((isCorrect ? success : failure));
        allCorrect = allCorrect && isCorrect;*/
    }
}
//end of EmptyClass
