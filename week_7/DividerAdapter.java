
package adapterpatter;
import java.math.BigDecimal;

public class DividerAdapter implements result{
    DivideInerface divideInt ;
    MultiplyInterface multInt ;
    
    public DividerAdapter(String type){
        if(type.equalsIgnoreCase("multiply")){
            mult MultiplyInterface = new mult();
            
        }
        else if(type.equalsIgnoreCase("divid"))
        {
            divid DivideInerface = new divid();
        }
    }

    DividerAdapter(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void expression(String type , String ex){
        if(type.equalsIgnoreCase("multiply"))
        {
           multtiplyInterface.multiply(BigDecimal.ONE,BigDecimal.TEN);
        }       
        else if(type.equalsIgnoreCase("divid")){

        DivideInerface.divide(BigDecimal.ONE,BigDecimal.TEN);
         
        }
}
}