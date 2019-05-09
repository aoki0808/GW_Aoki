package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//スーパークラスを定義
public class UseBeanServlet extends HttpServlet {
	@Override
	//doGetメソッドをオーバーライド
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//インスタンス化
		EmpBean bean = new EmpBean();
		//setNameメソッドを呼び出し
		bean.setName("KnowledgeTaro");
		//setAgeメソッドを呼び出し
		bean.setAge(20);
		//リクエストオブジェクトにbeenを入れてる
		request.setAttribute("emp",bean);
		//遷移先の指定
		RequestDispatcher rd = request.getRequestDispatcher("/useBean.jsp");
		//rdに投げてる
		rd.forward(request,response);
	}
}
