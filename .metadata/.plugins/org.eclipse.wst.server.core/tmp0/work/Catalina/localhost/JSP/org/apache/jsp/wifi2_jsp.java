/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-05-24 07:06:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;

public final class wifi2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<style>\r\n");
      out.write(".header {\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	background-color: #d7cccc;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("	height: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#pagebutton {\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<script>\r\n");
      out.write("	function func() {\r\n");
      out.write("		const changeCol = document.getElementById(\"changeColor\");\r\n");
      out.write("		if(changeCol.val()) {\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");

Integer fromPT = 1;
Integer cntPT = 10;

try {
	fromPT = Integer.parseInt(request.getParameter("fromPT"));
	cntPT = Integer.parseInt(request.getParameter("cntPT"));
} catch (Exception e) {
	;
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<BODY>\r\n");
      out.write("\r\n");
      out.write("	<table border=\"1\" align=\"center\">\r\n");
      out.write("		<tr class=\"header\">\r\n");
      out.write("			<td style=\"width: 50px\">번호</td>\r\n");
      out.write("			<td style=\"width: 700px\">주소</td>\r\n");
      out.write("			<td style=\"width: 300px\">위도</td>\r\n");
      out.write("			<td style=\"width: 300px\">경도</td>\r\n");
      out.write("			<td style=\"width: 300px\">거리</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");

		//======================================================================================
		//CSV 파일 가져와서 읽기

		File file = new File("C:/Users/euiyeob/Desktop/csvFile/전국무료와이파이표준데이터Refine.csv");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "MS949"));

		try {
			String readtxt;

			if ((readtxt = br.readLine()) == null) {
				out.print("빈파일 입니다.");
			}

			String[] field_name = readtxt.split(",");

			double lat = 37.3860521;
			double lng = 127.1214038;

			List<String> filefield = new ArrayList<>();
			int totalCount = 0;
			while ((readtxt = br.readLine()) != null) {
				filefield.add(readtxt);
				totalCount++;
			}

			//======================================================================================
			int startPage = 0;

			if (fromPT > 14828) {
				fromPT = 14821;
			}
			startPage = fromPT / (10 * cntPT) * 10;

			int nowPage = (fromPT / 10 + 1);

			int pageShow = 10;

			for (int i = fromPT - 1; i < fromPT + cntPT - 1; i++) {
				if (i == totalCount) {
			break;
				}

				String[] field = filefield.get(i).split(",");
				double dist = Math.sqrt(
				Math.pow(Double.parseDouble(field[13]) - lat, 2) + Math.pow(Double.parseDouble(field[14]) - lng, 2));
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>");
      out.print(i + 1);
      out.write("</td>\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			<td>");
      out.print(field[9]);
      out.write("</td>\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			<td>");
      out.print(field[13]);
      out.write("</td>\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			<td>");
      out.print(field[14]);
      out.write("</td>\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			<td>");
      out.print(dist);
      out.write("</td>\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td colspan=\"6\" align=\"center\">\r\n");
      out.write("				");

				//================================= 페이징 처리 =========================================
				//이전
				if (startPage == 0) {
					;
				} else {
				
      out.write(" <a\r\n");
      out.write("				href=\"wifi2.jsp?fromPT=");
      out.print((startPage - 10) * 10 + 1);
      out.write("&cntPT=");
      out.print(cntPT);
      out.write("\">\r\n");
      out.write("					<< </a> ");

 }
 //페이지

 for (int i = startPage; i < startPage + pageShow; i++) {
 if ((i * cntPT) > totalCount) {
 	break;
 }
 
 if(nowPage == i + 1) {

      out.write("  	\r\n");
      out.write("	 <a style=\"color : red\" href=\"wifi2.jsp?fromPT=");
      out.print(i * cntPT + 1);
      out.write("&cntPT=");
      out.print(cntPT);
      out.write('"');
      out.write('>');
      out.print(i + 1);
      out.write("\r\n");
      out.write("\r\n");

 }else {
	 
 
      out.write(" \r\n");
      out.write(" 	\r\n");
      out.write(" 	<a style=\"color : black\" href=\"wifi2.jsp?fromPT=");
      out.print(i * cntPT + 1);
      out.write("&cntPT=");
      out.print(cntPT);
      out.write('"');
      out.write('>');
      out.print(i + 1);
      out.write("\r\n");
      out.write("\r\n");

 }
	}

      out.write(" \r\n");
      out.write("	</a>\r\n");
      out.write("	\r\n");

 //다음
 if (startPage == (totalCount / (10 * cntPT)) * 10) {
 	;
 } else {
 
      out.write(" \r\n");
      out.write(" <a\r\n");
      out.write("				href=\"wifi2.jsp?fromPT=");
      out.print((startPage + 10) * cntPT + 1);
      out.write("&cntPT=");
      out.print(cntPT);
      out.write("\">\r\n");
      out.write("					>> </a>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("		");

		}
		} catch (Exception e) {
		out.print("에러메시지 : " + e + "<br>");
		} finally {
		br.close();
		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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