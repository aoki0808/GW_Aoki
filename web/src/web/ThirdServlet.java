package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		        //送信されてくるパラメータのエンコーディングの指定
				req.setCharacterEncoding("UTF-8");
				//送信したパラメータの取得(文字列)
				String name = req.getParameter("name");
				String age = req.getParameter("age");
				String gender = req.getParameter("gender");
				String java = req.getParameter("java");
				String php = req.getParameter("php");
				String c = req.getParameter("c");
				String nanika = req.getParameter("nanika");
				//以下、HTML形式で出力されるためのコード
				resp.setContentType("text/html; charset = UTF-8");
				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<head>");
				out.println("<body>");
				out.println("<h1>お名前</h1>");
				out.println("<p>"+name+"</p>");
				out.println("<h1>年齢</h1>");
				out.println("<p>"+age+"</p>");
				out.println("<h1>性別</h1>");
				out.println("<p>"+gender+"</p>");
				out.println("<h1>興味のある言語</h1>");
				//好きな言語の項目にチェックが入っていなかったらその部分は表示しない
				if(java != null) {
					out.println("<p>"+java+"</p>");
				}
				if(php != null) {
					out.println("<p>"+php+"</p>");
				}
				if(c != null) {
					out.println("<p>"+c+"</p>");
				}
				out.println("<h1>なにか一言</h1>");
				out.println("<p>"+nanika+"</p>");
				out.println("</body>");
				out.println("</head>");
				out.println("</html>");
				out.close();
	}
}
