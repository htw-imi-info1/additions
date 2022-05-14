/**
 * It is important to understand the difference between 
 * 
 * - object identity, tested with == and 
 * - object equality, tested with equals()
 * 
 * if you're working with strings, because you may introduce bugs in your 
 * code if you use == where you should use equals() (and vice versa)
 * 
 * Using String itself to illustrate the difference though is tricky, 
 * because the case with strings is a bit more complicated.
 * 
 * tl;dr: always use equals() in java if you want to compare two strings, and 
 * use the Address example to understand the difference.
 *
 * 
 * yet, sometimes s1 == s2 also works, and here's why:
 * 
 * 
 * Strings are more tricky for this exercise as they are
 * - immutable (can't be modified as Address(es) with setStreet() above) and thus
 * - can be interned, that is, equal strings can share one String Object 
 *   (which helps optimization: less space, faster comparision)
 *   
 * see https://www.baeldung.com/java-string-pool
 * and https://docs.oracle.com/javase/specs/jls/se18/html/jls-3.html#jls-3.10.5
 * if you want to know the details. But you really don't need to know them!
 * 
 * 
 */

public class StringEquality
{

    /**
     * This example illustrates String interning
     */
    public static void illustrateStringInterning(){

        String[] s = new String[6]; 

        s[1] = "Wilhelminenhofstr. Berlin";
        s[2] = "Wilhelminenhofstr. Berlin"; // will share interned s[1]
        s[3] = s[1];                        // just another pointer to s[1] !
        s[4] = new String("Wilhelminenhofstr. Berlin"); // new String Instance explicitly created
        s[5] = "Friedrichstr. Berlin"; // clearly not equal() to the others
        TablePrinter.printTable("s",s);
    }

    /**
     * thus, the results of the exercise differ,
     * depending wether the equal strings are interned:
     */
    public static void newExerciseWithStrings(){

        String[] s = new String[6]; 

        s[1] = new String("Wilhelminenhofstr. Berlin");
        s[2] = new String("Wilhelminenhofstr. Berlin");
        s[3] = new String("Köpenickerstr. Berlin");
        s[4] = new String("Köpenickerstr. Berlin");
        s[5] = s[4];
        s[5] = new String("Friedrichstr. Berlin"); // s5 now points to a newly created String!
        TablePrinter.printTable("s",s);
    }

    public static void newExerciseWithStringsInterned(){

        String[] s = new String[6]; 

        s[1] = "Wilhelminenhofstr. Berlin";
        s[2] = "Wilhelminenhofstr. Berlin";
        s[3] = "Köpenickerstr. Berlin";
        s[4] = "Köpenickerstr. Berlin";
        s[5] = s[4];
        s[5] = "Friedrichstr. Berlin";
        TablePrinter.printTable("s",s);
    }

    /**
     * This example illustrates six points:
     * 
     * 1. (initial string, points 2-7 are the six points:)

    2. String literals in the same class and package represent references to the same String object (§4.3.1).

    3. String literals in different classes in the same package represent references to the same String object.

    4. String literals in different classes in different packages likewise represent references to the same String object.

    5. Strings concatenated from constant expressions (§15.29) are computed at compile time and then treated as if they were literals.

    6. Strings computed by concatenation at run time are newly created and therefore distinct.

    7. The result of explicitly interning a computed string is the same String object as any pre-existing string literal with the same contents.
     
    Thus, only 6. results in a distinct instance. But: 
    
    8. according to the documentation of the String(String original) constructor in String, this also creates a new object
    
    @see https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#%3Cinit%3E(java.lang.String)
    
    9. which again can be explicity interned.
    */
    public static void specExample(){
        String lo = "lo";
        String[] h = new String[10]; 
        h[1] = "Hello";
        // example from the java spec:
        h[2] = "Hello";
        h[3] =Other.hello ;
        h[4] =other.Other.hello;
        h[5] = ("Hel"+"lo");
        h[6] = ("Hel"+lo);
        h[7] = ("Hel"+lo).intern();
        // examples added by bk
        h[8] = new String(h[1]);
        h[9] = h[8].intern();
        TablePrinter.printTable("h",h);

    }


}
