package basicosjuandiegogomez;


public class BasicosJuanDiegoGomez {

   
    public static void main(String[] args) {

    logicos();   
    cadenas();   
    numericos();
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
          
          a1 = x || x;
          a2 = x || y;
          a3 = y || x;
          a4 = y || y;
          
          System.out.println( x + " OR " + x + " = " + a1 );
          System.out.println( x + " OR " + y + " = " + a2 );
          System.out.println( y + " OR " + x + " = " + a3 );
          System.out.println( y + " OR " + y + " = " + a4 );
    }
    
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);

    
   
        
    }

    private static void cadenas() {
        String cadena = new String ();
        cadena = "cadenazo";
       
        System.err.println("Valor cadena");
        System.out.println(cadena);
    }


}