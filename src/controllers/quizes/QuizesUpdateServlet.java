package controllers.quizes;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Quiz;
import models.validators.QuizValidator;
import utils.DBUtil;

/**
 * Servlet implementation class QuizesUpdateServlet
 */
@WebServlet("/quizes/update")
public class QuizesUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuizesUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String _token = request.getParameter("_token");
	    if(_token != null && _token.equals(request.getSession().getId())){
	        EntityManager em = DBUtil.createEntityManager();

	        Quiz q = em.find(Quiz.class,(Integer)(request.getSession().getAttribute("quiz_id")));


	        Boolean codeDuplicateCheckFlag = true;
	        if(q.getCode().equals(request.getParameter("code"))){
	            codeDuplicateCheckFlag = false;
	        }else{
	            q.setCode(request.getParameter("code"));
	        }


	        q.setQuiz(request.getParameter("quiz"));
	        q.setAnswer(request.getParameter("answer"));


	        List<String> errors = QuizValidator.validate(q, codeDuplicateCheckFlag);
	        if(errors.size() > 0){
	            em.close();


	            request.setAttribute("_token", request.getSession().getId());
	            request.setAttribute("quiz", q);
	            request.setAttribute("errors", errors);


	            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/quizes/edit.jsp");
	            rd.forward(request, response);
	        }else{
	            em.getTransaction().begin();
	            em.getTransaction().commit();
	            request.getSession().setAttribute("flush", "更新が完了しました");
	            em.close();

	            request.getSession().removeAttribute("quiz_id");


	            response.sendRedirect(request.getContextPath() + "/quizes/index");
	        }
	    }
	}

}
