package controllers.questions;

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
 * Servlet implementation class QuestionsServlet
 */
@WebServlet("/questions")
public class QuestionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    EntityManager em = DBUtil.createEntityManager();

	    long quizes_count = (long)em.createNamedQuery("getQuizesCount",Long.class)
                .getSingleResult();

	    Quiz q = em.find(Quiz.class, (int)(Math.random()*quizes_count));

	    em.close();
	    request.setAttribute("questions", q);


	    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/questions/questions.jsp");
	    rd.forward(request, response);

	}

}
