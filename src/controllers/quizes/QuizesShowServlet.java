package controllers.quizes;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Quiz;
import utils.DBUtil;

/**
 * Servlet implementation class QuizesShowServlet
 */
@WebServlet("/quizes/show")
public class QuizesShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuizesShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    EntityManager em = DBUtil.createEntityManager();


	    Quiz q = em.find(Quiz.class, Integer.parseInt(request.getParameter("id")));

	    em.close();

	    request.setAttribute("quiz", q);


	    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/quizes/show.jsp");
	    rd.forward(request, response);
	}

}
