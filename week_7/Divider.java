
package adapterpatter;
import java.math.BigDecimal;

public class Divider  implements DivideInerface{
    
        public BigDecimal Divide(BigDecimal value ,BigDecimal Divider){
        
        return value.divide(Divider);
        }

    @Override
    public void divide(BigDecimal ONE, BigDecimal TEN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
