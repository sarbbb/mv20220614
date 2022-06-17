import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;
import model.User;
import java.util.*;

@WebServlet("/gs1")
public class GsonObj1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public GsonObj1Servlet() {
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u1=new User("George","02-23826015","12345",25,false);
		Gson g=new Gson();
		String s=g.toJson(u1);
		List<User>  data=new ArrayList<>();
		data.add(u1);
		u1=new User("Mary","02-23826017","2468",20,false);
		data.add(u1);
		String s2=g.toJson(data);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h1>"+s+"</h1>");
		response.getWriter().append("<h1>"+s2+"</h1>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
