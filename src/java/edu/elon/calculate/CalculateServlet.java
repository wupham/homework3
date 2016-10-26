/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.calculate;

import java.io.IOException;
import java.io.PrintWriter;
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
                String url = "/index.html";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String amount = request.getParameter("Amount");
            String rate = request.getParameter("Rate");
            String years = request.getParameter("Years");
            
            // store data in User object


            // validate the parameters
            //String message;
            if (amount == null || rate == null ||years == null ||
                amount.isEmpty() || rate.isEmpty() || years.isEmpty()) {
                //message = "Please fill out all three text boxes.";
                url = "/index.html";
            } 
            else {
                //message = "";
                url = "/result.jsp";
 
            }
            
            //TODO: make sure the values user enters are ints
            //TODO: make a method that calculates things
            
            
            request.setAttribute("amount", amount);
            request.setAttribute("rate", rate);
            request.setAttribute("years", years);
            
            //request.setAttribute("user", user);
            //request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    }
