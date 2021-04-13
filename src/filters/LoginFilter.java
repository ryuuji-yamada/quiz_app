package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    /**
     * Default constructor.
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    String context_path = ((HttpServletRequest)request).getContextPath();
	    String servlet_path = ((HttpServletRequest)request).getServletPath();


	    if(!servlet_path.matches("/css.*") && !servlet_path.matches("/js.*")){
	        HttpSession session = ((HttpServletRequest)request).getSession();


	        String name = (String)session.getAttribute("name");


	        if(!servlet_path.equals("/index.html") && !servlet_path.equals("/questions") && !servlet_path.equals("/5questions") && !servlet_path.equals("/questions/result") && !servlet_path.equals("/quizes/login")){
	            //ログアウト状態であれば
	            //ログイン画面にリダイレクト
	            if(name == null){
	                ((HttpServletResponse)response).sendRedirect(context_path + "/quizes/login");
	                return;
	            }

	        }else{
	            //ログイン状態でもログイン画面を表示される場合は
	            //indexへリダイレクト
	            if(name != null){
	                ((HttpServletResponse)response).sendRedirect(context_path + "/quizes/index");
	                return;
	            }
	        }
	    }
	    chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
