package controllers.quizes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Quiz;

/**
 * Servlet implementation class QuizesNewServlet
 */
@WebServlet("/quizes/new")
public class QuizesNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuizesNewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setAttribute("_token", request.getSession().getId());
	    request.setAttribute("quiz", new Quiz());


	    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/quizes/new.jsp");
	    rd.forward(request, response);
	}

}
