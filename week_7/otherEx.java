
package adapterpatter;


public class otherEx  implements result{
    DividerAdapter dividAd;
    public  void expreassion(String type , String ex){
        if(type.equalsIgnoreCase("addition")){
            System.out.println("it is addition" + ex);
        }
        else if(type.equalsIgnoreCase("multiply") || type.equalsIgnoreCase("divider")){
            DividerAdapter DividerAdapter = new DividerAdapter(type);
            DividerAdapter.expression(type,ex);
        }
        else
        {
            System.out.println("error");
        }   

    }

    public void expression(String multiply, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void expression(String multiply, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
