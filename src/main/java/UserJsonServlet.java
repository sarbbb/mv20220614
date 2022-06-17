
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import com.google.gson.*;

@WebServlet("/UserJsonServlet")
public class UserJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserJsonServlet() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String js=request.getParameter("jstring");
		Gson g=new Gson();
		User u1=g.fromJson(js, User.class);
		response.getWriter().append(u1.toString());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
