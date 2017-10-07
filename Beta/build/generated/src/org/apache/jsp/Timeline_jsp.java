package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Timeline_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

  
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Message","root","")
String query = select * from Message;
resultSet rs=Statement.executeQuery("query");  
int i = 1;
String swap="left";

      out.write("\n");
      out.write("\n");
      out.write("int i=1;\n");
      out.write("String swap=\"left\";\n");
      out.write("1.connection\n");
      out.write("2.queryy run-in \n");
      out.write("3.rs data aagya\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Track Timeline</title>\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"easy.png\"/>\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    background-color: #474e5d;\n");
      out.write("    font-family: Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The actual timeline (the vertical ruler) */\n");
      out.write(".timeline {\n");
      out.write("    position: relative;\n");
      out.write("    max-width: 1200px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The actual timeline (the vertical ruler) */\n");
      out.write(".timeline::after {\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    width: 6px;\n");
      out.write("    background-color: white;\n");
      out.write("    top: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 50%;\n");
      out.write("    margin-left: -3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Container around content */\n");
      out.write(".container {\n");
      out.write("    padding: 10px 40px;\n");
      out.write("    position: relative;\n");
      out.write("    background-color: inherit;\n");
      out.write("    width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The circles on the timeline */\n");
      out.write(".container::after {\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    width: 25px;\n");
      out.write("    height: 25px;\n");
      out.write("    right: -17px;\n");
      out.write("    background-color: white;\n");
      out.write("    border: 4px solid #FF9F55;\n");
      out.write("    top: 15px;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Place the container to the left */\n");
      out.write(".left {\n");
      out.write("    left: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Place the container to the right */\n");
      out.write(".right {\n");
      out.write("    left: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add arrows to the left container (pointing right) */\n");
      out.write(".left::before {\n");
      out.write("    content: \" \";\n");
      out.write("    height: 0;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 22px;\n");
      out.write("    width: 0;\n");
      out.write("    z-index: 1;\n");
      out.write("    right: 30px;\n");
      out.write("    border: medium solid white;\n");
      out.write("    border-width: 10px 0 10px 10px;\n");
      out.write("    border-color: transparent transparent transparent white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add arrows to the right container (pointing left) */\n");
      out.write(".right::before {\n");
      out.write("    content: \" \";\n");
      out.write("    height: 0;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 22px;\n");
      out.write("    width: 0;\n");
      out.write("    z-index: 1;\n");
      out.write("    left: 30px;\n");
      out.write("    border: medium solid white;\n");
      out.write("    border-width: 10px 10px 10px 0;\n");
      out.write("    border-color: transparent white transparent transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Fix the circle for containers on the right side */\n");
      out.write(".right::after {\n");
      out.write("    left: -16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The actual content */\n");
      out.write(".content {\n");
      out.write("    padding: 20px 30px;\n");
      out.write("    background-color: white;\n");
      out.write("    position: relative;\n");
      out.write("    border-radius: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Media queries - Responsive timeline on screens less than 600px wide */\n");
      out.write("@media all and (max-width: 600px) {\n");
      out.write("  /* Place the timelime to the left */\n");
      out.write("  .timeline::after {\n");
      out.write("    left: 31px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /* Full-width containers */\n");
      out.write("  .container {\n");
      out.write("    width: 100%;\n");
      out.write("    padding-left: 70px;\n");
      out.write("    padding-right: 25px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /* Make sure that all arrows are pointing leftwards */\n");
      out.write("  .container::before {\n");
      out.write("    left: 60px;\n");
      out.write("    border: medium solid white;\n");
      out.write("    border-width: 10px 10px 10px 0;\n");
      out.write("    border-color: transparent white transparent transparent;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  /* Make sure all circles are at the same spot */\n");
      out.write("  .left::after, .right::after {\n");
      out.write("    left: 15px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  /* Make all right containers behave like the left ones */\n");
      out.write("  .right {\n");
      out.write("    left: 0%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"timeline\">");

 While(rs.next()) { 
      out.write("\n");
      out.write("  <div class=\"container \"+swap+\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <h2>Phase ");
      out.print(i);
      out.write("</h2>\n");
      out.write("      <p>");
      out.print( rs.getString(1) );
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  ");
i++;  
      out.write('\n');
      out.write(' ');
 } 
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"timeline\">\n");
      out.write("  <div class=\"container left\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <h2>Phase 1</h2>\n");
      out.write("      <p></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container right\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <h2>Phase 2</h2>\n");
      out.write("      <p><p>\n");
      out.write("\t  <p></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container left\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <h2>Phase 3</h2>\n");
      out.write("      <p> </p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container right\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <h2>Phase 4</h2>\n");
      out.write("      <p></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container left\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <h2>Phase 5</h2>\n");
      out.write("      <p></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container right\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <h2>Phase 6</h2>\n");
      out.write("      <p></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
