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
        String resultAmount = formatter.format(class1.getInitParameter("amountd"));
	String resultValue = formatter.format(class1.getInitParameter("value"));
	

        try {
            JspWriter out = pageContext.getOut();
            out.print(resultAmount);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        try {
            JspWriter out = pageContext.getOut();
            out.print(resultValue);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        return SKIP_BODY;
    }
}