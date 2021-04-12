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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String user_answer = request.getParameter("user_answer");
        String questions_answer = request.getParameter("questions_answer");


        request.getSession().setAttribute("user_answer", user_answer);
        request.getSession().setAttribute("questions_answer", questions_answer);


            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/questions/result.jsp");
            rd.forward(request, response);

            request.getSession().removeAttribute("user_answer");
            request.getSession().removeAttribute("questions_answer");
	}

}
