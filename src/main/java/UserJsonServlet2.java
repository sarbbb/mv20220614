import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.User;

@WebServlet("/UserJsonServlet2")
public class UserJsonServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public UserJsonServlet2() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String js=request.getParameter("jstring2");
		Gson g=new Gson();
		User[]  u1=g.fromJson(js, User[].class);
		String temp="";
		for(User u : u1) {
			temp+=u.toString()+"<br/>";
		}
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append(temp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
