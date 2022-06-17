
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;
import model.*;

@WebServlet("/jsobj")
public class JStringObjServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public JStringObjServlet() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jsonString = "{\"name\":\"Maxsu\", \"age\":24}"; 
		Gson g=new Gson();
		Student s1=g.fromJson(jsonString, Student.class);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h1>"+s1.toString()+"</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
