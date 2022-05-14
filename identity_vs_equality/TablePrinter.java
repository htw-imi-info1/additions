public class TablePrinter
{
    public static void printEmpty(String name, int n){
        Object[] a = new Object[n+1];
        System.out.println();
        printHeader(name,a);
        printRows(name,a,true);
    }

    public static void printTable(String name, Object[] a){
        System.out.println();
        printHeader(name,a);
        printRows(name,a,false);
    }

    private static void printRows(String n,Object[] a,boolean printEmpty){
        // print table
        for(int row=1;row<a.length;row++){
            System.out.print(" "+n+row);

            for(int col=1;col<a.length;col++){
                if (printEmpty){
                    System.out.print("  / ");
                } else {
                    String identical = b2s(a[row] == a[col]);
                    String equal = b2s(a[row].equals(a[col]));    
                    System.out.print(" "+ identical+"/"+equal);
                }
            }
            System.out.println();
        }
    }

    private static void printHeader(String n,Object[] a){
        System.out.print("  ");
        for(int col=1;col<a.length;col++){
            System.out.print("  "+n+col);
        }
        System.out.println();}

    private static String b2s(boolean b){
        return b ? "T" : "F";
    }
}
