
package basicosjuandiegogomez;


public class BasicosJuanDiegoGomez {

   
    public static void main(String[] args) {
    logicos();   
    }
    public static void logicos(){
          boolean x = true;
          boolean y = false;
          boolean a1 = x && x;
          boolean a2 = x && y;
          boolean a3 = y && x;
          boolean a4 = y && y;

          
          System.out.println( x + " AND " + x + " = " + a1 );
          System.out.println( x + " AND " + y + " = " + a2 );
          System.out.println( y + " AND " + x + " = " + a3 );
          System.out.println( y + " AND " + y + " = " + a4 );
    }
}
