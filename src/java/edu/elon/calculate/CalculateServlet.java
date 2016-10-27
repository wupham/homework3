/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.calculate;

import java.io.IOException;
import java.text.NumberFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wesley
 */
public class CalculateServlet extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/calculate.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/calculate.jsp";    // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String amount = request.getParameter("Amount");
            String rate = request.getParameter("Rate");
            String years = request.getParameter("Years");
            
            // validate the parameters

            if (amount == null || rate == null || years == null ||
                amount.isEmpty() || rate.isEmpty() || years.isEmpty()) {
                //message = "Please fill out all three text boxes.";
                url = "/calculate.jsp";
						}
            else {
                //message = "";
                url = "/results.jsp";
            }
            
            double amountd = Double.parseDouble(amount);
						double rated = Double.parseDouble(rate);
						double yearsd = Double.parseDouble(years);

						double value = doMath(amountd, rated, yearsd);
            
						NumberFormat formatter = NumberFormat.getCurrencyInstance();
						
						String resultAmount = formatter.format(amountd);
						String resultRate = Double.toString(rated);
						String resultValue = formatter.format(value);
						
						User user = new User(resultAmount,resultRate,years,resultValue);

            request.setAttribute("user", user);
            //request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
	

		private double doMath (double amount, double rate, double years) {
			double value = 0;
			rate = rate/100;
			value = amount*Math.pow((1+(rate)),years);
			return value;
		}
}

		