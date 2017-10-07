
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class FileUploadServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Reporting</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FileUploadServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
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

                     //1.mydropdown 2.txtsarpanchname 3.txtcomment 4.Place 5.Photo
         try{
             Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/publiccomplaintreport","root","");
                    
                    
            PreparedStatement stmt=con.prepareStatement("insert into publiccomplaintreport values(?,?,?,?,?)");
            
                   
             
        List<FileItem> formItems=new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
					long seconds=System.currentTimeMillis()/1000;
	
					
					if (formItems != null && formItems.size() > 0) {
						// iterates over form's fields
						for (FileItem item : formItems) {
                                                    String name=item.getFieldName();
                                                    
                                                    if(name.equals("mydropdown"))
                                                    {
                                                       // System.out.println(item.getString());
                                                        stmt.setString(1, item.getString());
                                                    }
                                                    else if(name.equals("txtsarpanchname"))
                                                    {
                                                        //System.out.println(item.getString());
                                                        stmt.setString(2, item.getString());
                                                    
                                                    }
                                                    else if(name.equals("txtcomment"))
                                                    {
                                                   //     System.out.println(item.getString());
                                                    stmt.setString(3, item.getString());
                                                    }
                                                    else if(name.equals("Place"))
                                                    {
                                                    //    System.out.println(item.getString());
                                                    stmt.setString(4, item.getString());
                                                    }
                                                   else if(name.equals("Photo"))
                                                    {
                                                    String uploadPath ="C:\\Users\\HP\\Desktop\\UploadedImages";
					            	 String fileName = seconds+new File(item.getName()).getName();
							         String filePath=uploadPath+fileName;
							         item.write(new File(uploadPath,fileName));
							         System.out.println(filePath);
	
                                                                 stmt.setString(5, filePath);
                                                   
										// saves the file on disk
										request.setAttribute("message",
											filePath+"Upload has been done successfully!");}
                                                    
                                                }
	
                                        }
                                        
                                    int i=stmt.executeUpdate();  
                                   System.out.println(i+" records inserted");  
                                  //      con.commit();
                                        
        }
        catch (Exception e)
        {System.out.println(e);}
                                        
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
