package tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import edu.elon.calculate.CalculateServlet;
import java.text.NumberFormat;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;


public class currencyFormat extends TagSupport {
private String amount;
 NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    
    	public void setAmount(double amount) {
        this.amount = currency.format(amount) ;
    }
  
 @Override
    public int doStartTag() throws JspException {
      
 

        try {
            JspWriter out = pageContext.getOut();
            out.print(amount);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
       
        return SKIP_BODY;
    }
}