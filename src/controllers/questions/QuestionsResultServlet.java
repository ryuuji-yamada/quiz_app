package controllers.questions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class QuestionsResultServlet
 */
@WebServlet("/questions/result")
public class QuestionsResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionsResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String user_answer = (String)request.getSession().getAttribute("user_answer");
	    String questions_answer = (String)request.getSession().getAttribute("questions_answer");


	        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/questions/result.jsp");
	        rd.forward(request, response);

	        request.getSession().removeAttribute(user_answer);
	        request.getSession().removeAttribute(questions_answer);




	}

}
