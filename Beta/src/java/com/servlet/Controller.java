
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;


public class Controller extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
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
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
                    String Query="select * from loginid where USER_ID=? and USER_PASS=?";
                    PreparedStatement pstm= con.prepareStatement(Query);
                    pstm.setString(1,_username);
                    pstm.setString(2,_password);
                    ResultSet rs=pstm.executeQuery();
                    if(rs.next())
                    
                    {
                        response.sendRedirect("supervisorprofile.jsp");
                    }
                    else
                    {
                      pw.print("<font color=red>username,"+"password didn't match</font>");
                        RequestDispatcher rd=request.getRequestDispatcher("supervisorlogin.jsp");
                        rd.include(request, response);
                    }
                }
            }
            catch(Exception ex)
            {
                out.println("Exception :"+ex.getMessage());
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
