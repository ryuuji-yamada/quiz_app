package controllers.questions;

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
import utils.DBUtil;

/**
 * Servlet implementation class Questions_5Servlet
 */
@WebServlet("/5questions")
public class Questions_5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Questions_5Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  //DB開く
        EntityManager em = DBUtil.createEntityManager();


        //ランダムに５問取得
        List<Quiz> q =em.createNamedQuery("getQuizesRandom",Quiz.class).getResultList();

        //DB閉じる
        em.close();


        //クイズを５問設定
        request.getSession().setAttribute("questions", q);



        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/questions/5questions.jsp");
        rd.forward(request, response);
	}

}
