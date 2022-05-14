
/**
 * This is the exercise done in class:
 * classExercise 13.5.2022
 */
public class Exercises
{
    public static void printEmptyClassExercise(){
         TablePrinter.printEmpty("a",5);
    }
    public static void classExercise(){
        // use an array instead of individual 
        // variables to be able to easily loop through them..
        // just read a[1] like a1 or peek ahead in the book
        // if you're curious
        Address[] a = new Address[6]; // six elements to be able to skip 0

        a[1] = new Address("Wilhelminenhofstr.","Berlin");
        a[2] = new Address("Wilhelminenhofstr.","Berlin");
        a[3] = new Address("Köpenickerstr.","Berlin");
        a[4] = a[3];
        a[5] = a[3];
        a[5].setStreet("Friedrichstr.");
        TablePrinter.printTable("a",a);
    }

    public static void newExercise(){
        Address[] b = new Address[6]; 
        b[1] = new Address("Wilhelminenhofstr.","Berlin");
        b[2] = new Address("Wilhelminenhofstr.","Berlin");
        b[3] = new Address("Köpenickerstr.","Berlin");
        b[4] = new Address("Köpenickerstr.","Berlin");
        b[5] = b[4];
        b[5].setStreet("Friedrichstr.");
        TablePrinter.printTable("b",b);
    }

    
}
