/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2021-09-24 03:30:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formLichThi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Lá»ch thi</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/lichThi.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/base.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/grid.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("        integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"app\">\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class=\"grid wide\">\r\n");
      out.write("                <img class=\"header_img\" src=\"./assets/image/Poly.png\" alt=\"\">\r\n");
      out.write("                <img class=\"header_icon_user\" src=\"./assets/image/user.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"container_header\">\r\n");
      out.write("                <table class=\"tblTT\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>BLOCK 1- KÌ SPRING</td>\r\n");
      out.write("                        <td>PHÒNG THI: ONLINE</td>\r\n");
      out.write("                        <td>GIỜ THI: 16:20 TO 18:20</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>MÃ THI: TIN HỌC</td>\r\n");
      out.write("                        <td>NGÀY THI: 04/03/2021</td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container_body\">\r\n");
      out.write("                <table class=\"table tbl_body\">\r\n");
      out.write("                    <thead class=\"table-danger\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <th scope=\"col\">TT</th>\r\n");
      out.write("                          <th scope=\"col\">MSSV</th>\r\n");
      out.write("                          <th scope=\"col\">HỌ TÊN</th>\r\n");
      out.write("                          <th scope=\"col\">LỚP</th>\r\n");
      out.write("                          <th scope=\"col\">KÝ TÊN</th>\r\n");
      out.write("                          <th scope=\"col\">ĐIỂM</th>\r\n");
      out.write("                          <th scope=\"col\">GHI CHÚ</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                      </thead>\r\n");
      out.write("                      <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <th scope=\"row\">1</th>\r\n");
      out.write("                          <td>PH17388</td>\r\n");
      out.write("                          <td>NGUYỄN LÊ HẢI</td>\r\n");
      out.write("                          <td>PT16309</td>\r\n");
      out.write("                          <td>HẢI</td>\r\n");
      out.write("                          <td>10</td>\r\n");
      out.write("                          <td>PERFECT</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th scope=\"row\">1</th>\r\n");
      out.write("                          <td>PH17388</td>\r\n");
      out.write("                          <td>NGUYỄN LÊ HẢI</td>\r\n");
      out.write("                          <td>PT16309</td>\r\n");
      out.write("                          <td>HẢI</td>\r\n");
      out.write("                          <td>10</td>\r\n");
      out.write("                          <td>PERFECT</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th scope=\"row\">1</th>\r\n");
      out.write("                          <td>PH17388</td>\r\n");
      out.write("                          <td>NGUYỄN LÊ HẢI</td>\r\n");
      out.write("                          <td>PT16309</td>\r\n");
      out.write("                          <td>HẢI</td>\r\n");
      out.write("                          <td>10</td>\r\n");
      out.write("                          <td>PERFECT</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                      </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer class=\"footer\">\r\n");
      out.write("            <div class=\"footer_button\">\r\n");
      out.write("                <button class=\"btn_download js-btn_download\">DOWNLOAD</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"modal_download js-modal_download\">\r\n");
      out.write("            <div class=\"modal_download-container js-modal_download-container\">\r\n");
      out.write("                <div class=\"header-modal_dowload-container\">\r\n");
      out.write("                    <img class=\"btn_close\" src=\"./assets/image/left-arrow.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"body-modal_dowload-container\">\r\n");
      out.write("                    <img src=\"./assets/image/241400644_4384520114929340_1276692022253364513_n.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-modal_dowload-container\">\r\n");
      out.write("                    <button class=\"modal-btn_download\">DOWNLOAD</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        const downLoadBtn = document.querySelector('.js-btn_download');\r\n");
      out.write("        const modal = document.querySelector('.js-modal_download');\r\n");
      out.write("        const btnClose = document.querySelector('.btn_close');\r\n");
      out.write("        const modalContainer = document.querySelector('.js-modal_download-container');\r\n");
      out.write("\r\n");
      out.write("        function showModal(){\r\n");
      out.write("            modal.classList.add('open');\r\n");
      out.write("        }\r\n");
      out.write("        function hideModal(){\r\n");
      out.write("            modal.classList.remove('open');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        downLoadBtn.addEventListener('click', showModal);\r\n");
      out.write("\r\n");
      out.write("        btnClose.addEventListener('click', hideModal);\r\n");
      out.write("\r\n");
      out.write("        modalContainer.addEventListener('click', function(event){\r\n");
      out.write("            event.stopPropagation();\r\n");
      out.write("        })\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}