
package adapterpatter;


public class AdapterPatter{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        otherEx E = new otherEx();
        E.expression("multiply" , "*");
        E.expression("addition" , "+");
        E.expression("divid","/");
    }
    
}
