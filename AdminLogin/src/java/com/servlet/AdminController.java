
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminController extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw=response.getWriter();
        try (PrintWriter out = response.getWriter()) {
           
            String _username=request.getParameter("txtusername");
            String _password=request.getParameter("txtpassword");
            try
            {
                if(_username!=null)
                {
                    if(_username.equals("konnerdave@gmail.com") && _password.equals("argument@786"))
                    {
                        response.sendRedirect("welcome.jsp");
                    }
                    else
                    {
                      pw.print("<font color=red>username,"+"password didn't match</font>");
                        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                        rd.include(request, response);
                    }
                }
            }
            catch(Exception ex)
            {
                out.println("Error :"+ex.getMessage());
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
        }
   
