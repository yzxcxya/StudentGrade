/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-19 01:07:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005finfo_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>学生信息列表</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 3px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 3px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tcolor: #e1e2e3;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".setting_ {\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE6 {color: #000000; font-size: 12; }\r\n");
      out.write(".STYLE10 {color: #000000; font-size: 12px; }\r\n");
      out.write(".STYLE19 {\r\n");
      out.write("\tcolor: #344b50;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE21 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #3b6375;\r\n");
      out.write("}\r\n");
      out.write(".STYLE22 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #295568;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("var  highlightcolor='#d5f4fe';\r\n");
      out.write("//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(\r\n");
      out.write("var  clickcolor='#51b2f6';\r\n");
      out.write("function  changeto(){\r\n");
      out.write("source=event.srcElement;\r\n");
      out.write("if  (source.tagName==\"TR\"||source.tagName==\"TABLE\")\r\n");
      out.write("return;\r\n");
      out.write("while(source.tagName!=\"TD\")\r\n");
      out.write("source=source.parentElement;\r\n");
      out.write("source=source.parentElement;\r\n");
      out.write("cs  =  source.children;\r\n");
      out.write("//alert(cs.length);\r\n");
      out.write("if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!=\"nc\"&&cs[1].style.backgroundColor!=clickcolor)\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("\tcs[i].style.backgroundColor=highlightcolor;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function  changeback(){\r\n");
      out.write("if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id==\"nc\")\r\n");
      out.write("return\r\n");
      out.write("if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)\r\n");
      out.write("//source.style.backgroundColor=originalcolor\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("\tcs[i].style.backgroundColor=\"\";\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function  clickto(){\r\n");
      out.write("source=event.srcElement;\r\n");
      out.write("if  (source.tagName==\"TR\"||source.tagName==\"TABLE\")\r\n");
      out.write("return;\r\n");
      out.write("while(source.tagName!=\"TD\")\r\n");
      out.write("source=source.parentElement;\r\n");
      out.write("source=source.parentElement;\r\n");
      out.write("cs  =  source.children;\r\n");
      out.write("//alert(cs.length);\r\n");
      out.write("if  (cs[1].style.backgroundColor!=clickcolor&&source.id!=\"nc\")\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("\tcs[i].style.backgroundColor=clickcolor;\r\n");
      out.write("}\r\n");
      out.write("else\r\n");
      out.write("for(i=0;i<cs.length;i++){\r\n");
      out.write("\tcs[i].style.backgroundColor=\"\";\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction check(){\r\n");
      out.write("\t\r\n");
      out.write("\tif(form.stu_name.value==\"\" || form.stu_name.value==null){\r\n");
      out.write("\talert(\"学生姓名不能为空\");\r\n");
      out.write("\tform.username.focus();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\tfunction atSumbit_query(){\r\n");
      out.write("\t\tform_.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"40\">\r\n");
      out.write("    <form name=\"form\" action=\"/StuInfoList\" method=\"get\" onsubmit=\"return check()\">\r\n");
      out.write("\t    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t      <tr>\r\n");
      out.write("\t        <td height=\"30\" bgcolor=\"#353c44\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t          <tr>\r\n");
      out.write("\t            <td width=\"40%\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t              <tr>\r\n");
      out.write("\t                <td width=\"6%\" height=\"19\" valign=\"bottom\"><div align=\"center\"><img src=\"");
      out.print(path);
      out.write("/indexpage/images/tb.gif\" width=\"14\" height=\"14\" /></div></td>\r\n");
      out.write("\t                <td width=\"94%\" valign=\"bottom\"><span class=\"STYLE1\"> 学生信息列表</span></td>\r\n");
      out.write("\t              </tr>\r\n");
      out.write("\t            </table></td>\r\n");
      out.write("\t            \r\n");
      out.write("\t             <td class=\"STYLE1\">学生名称：<input type=\"text\" name=\"stu_name\" placeholder=\"请输入学生姓名\"/>\r\n");
      out.write("\t             \t<!-- <img src=\"");
      out.print( path );
      out.write("/images/search.gif\" style=\"cursor:hand\" border=\"0\" onclick=\"atSumbit_query()\"> -->\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"查 询\">\r\n");
      out.write("\t             </td>\r\n");
      out.write("\t            </form>\r\n");
      out.write("\t              <form action=\"/StuInfoList\" method=\"post\">\r\n");
      out.write("\t              <td>\r\n");
      out.write("\t             \t<input class=\"setting_\" type=\"submit\" name=\"submit\" value=\"查询全部学生信息\"/>\r\n");
      out.write("\t             </td>\r\n");
      out.write("\t             </form>\r\n");
      out.write("\t             <td>\r\n");
      out.write("\t             \t<a href =\"index.jsp\"><input type =\"button\" name =\"setting_\" value=\"返回\"/></a>\r\n");
      out.write("\t          </tr>\r\n");
      out.write("\t        </table></td>\r\n");
      out.write("\t      </tr>\r\n");
      out.write("\t    </table>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#a8c7ce\" onmouseover=\"changeto()\"  onmouseout=\"changeback()\">\r\n");
      out.write("      <tr>\r\n");
      out.write("      \t<td width=\"5%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">序号</span></div></td>\r\n");
      out.write("        <td width=\"12%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">姓名</span></div></td>\r\n");
      out.write("        <td width=\"12%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">性别</span></div></td>\r\n");
      out.write("        <td width=\"12%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">学号</span></div></td>\r\n");
      out.write("        <td width=\"12%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">班级</span></div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("       \r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /student_info_list.jsp(156,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/student_info_list.jsp(156,8) '${studentAll}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${studentAll}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /student_info_list.jsp(156,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("student");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("       <tr>\r\n");
          out.write("      \t<td width=\"5%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.studentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></div></td>\r\n");
          out.write("        <td width=\"12%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.studentName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></div></td>\r\n");
          out.write("        <td width=\"12%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.studentSex}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></div></td>\r\n");
          out.write("        <td width=\"12%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.studentId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></div></td>\r\n");
          out.write("        <td width=\"12%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.studentClass}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></div></td>\r\n");
          out.write("        </tr>\r\n");
          out.write("       ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
