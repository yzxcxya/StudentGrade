/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-19 00:40:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddScore_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html ;charset = UTF-8;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\r\n");
      out.write("\r\n");
      out.write("\">\r\n");
      out.write(" <html>\r\n");
      out.write(" <head>\r\n");
      out.write(" <title>\r\n");
      out.write(" <center><h1>学生成绩录入</h1></center>\r\n");
      out.write(" </title>\r\n");
      out.write(" \r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write(" <body background = \"/images/StuAdd.jpg\">\r\n");
      out.write(" <form action=\"/AddScore\" method=\"get\">\r\n");
      out.write(" <center>\r\n");
      out.write(" <font size=\"10\" face=\"arial\" color=\"white\">学生成绩添加</font><br><br><br><br><br>\r\n");
      out.write(" <table>\r\n");
      out.write(" <tr>\r\n");
      out.write("     <td><font size=\"10\" color=#000000>学&nbsp;号：</font></td>\r\n");
      out.write("     <td><input type=\"text\" style=\"width:200px; height:40px;\" placeholder=\"请输入学号\" name = \"id\"></td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("     <td><font size=\"10\" color=#000000>课程号：</font></td>\r\n");
      out.write("     <td><input type=\"text\" style=\"width:200px; height:40px;\" placeholder=\"请输入课程号\" name = \"courseId\"></td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("     <td><font size=\"10\" color=#000000>分&nbsp;数：</font></td>\r\n");
      out.write("     <td><input type=\"text\" style=\"width:200px; height:40px;\" placeholder=\"请输入分数\" name = \"grade\"></td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" <tr>\r\n");
      out.write("    <td><input type=\"submit\" style=\"width:200px; height:40px;\" name = \"提交\"></td>\r\n");
      out.write(" \t<td><input type=\"reset\" style=\"width:200px; height:40px;\" name = \"重置\"></td>\r\n");
      out.write(" \t<td><a href =\"index.jsp\"><input type=\"button\" style=\"width:200px; height:40px;\" value=\"返回\"></a></td>\t\r\n");
      out.write(" </tr>\r\n");
      out.write(" </table>\r\n");
      out.write(" </center>\r\n");
      out.write(" \r\n");
      out.write(" </form>\r\n");
      out.write(" </body>\r\n");
      out.write(" </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
