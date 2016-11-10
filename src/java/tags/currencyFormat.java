package tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

import java.text.NumberFormat;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import edu.elon.calculate;

public class currencyFormat extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
      String resultAmount = formatter.format(amountd);
	String resultRate = Double.toString(rated);
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