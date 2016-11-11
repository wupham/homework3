package tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import edu.elon.calculate.CalculateServlet;
import java.text.NumberFormat;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;


public class currencyFormat extends TagSupport {
CalculateServlet class1 = new CalculateServlet();
    @Override
    public int doStartTag() throws JspException {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        //get this shit to work. i want to access the variables in class1 which is an object of CalculateServlet
        //were gucci if we can fgure this out, everything else will be smooth
       String resultAmount = formatter.format(class1.getClass().getField(amountd));
	String resultRate = Double.toString(class1.getClass().getField(rated));
	String resultValue = formatter.format(value);
	

        try {
            JspWriter out = pageContext.getOut();
            out.print(currentDateFormatted);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        return SKIP_BODY;
    }
}