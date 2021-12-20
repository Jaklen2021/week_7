
package adapterpatter;
import java.math.BigDecimal;
public class multiplier implements MultiplyInterface{
    public BigDecimal mult(BigDecimal value ,BigDecimal multiplicand){
        if(value== null || multiplicand==null)
            return null;
        
        return value.multiply(multiplicand);
    }

    @Override
    public BigDecimal multiply(BigDecimal value, BigDecimal multiplicand) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
