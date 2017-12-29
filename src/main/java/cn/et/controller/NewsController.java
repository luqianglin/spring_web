package cn.et.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.et.Tools.PageTools;
import cn.et.service.NewsService;

/**
 * Servlet implementation class NewsController
 */
public class NewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符集
		response.setContentType("text/html;charset=UTF-8");
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		NewsService ns =(NewsService)ac.getBean("newsServiceImpl");
		String myContent = request.getParameter("myContent");
		String curPage = request.getParameter("curpage");
		Integer curPageInt = 1;
		//判断分页不为null
		if(curPage != null){
			curPageInt = Integer.parseInt(curPage);
		}
		PageTools queryNewsByContent = ns.queryNewsByContent(myContent,curPageInt);
		request.setAttribute("newsList", queryNewsByContent);
		request.getRequestDispatcher("/news.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
