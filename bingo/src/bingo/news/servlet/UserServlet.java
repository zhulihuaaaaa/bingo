package bingo.news.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.itcast.commons.CommonUtils;
import bingo.news.domain.static_user;
import bingo.news.service.UserService;
import cn.itcast.servlet.BaseServlet;

/**
 * 用户模块WEB层
 * @author zhulihua
 *
 */
public class UserServlet extends BaseServlet {
	private UserService userService = new UserService();

	/**
	 * 登录功能
	 */
	public String login(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/*static_user formUser = CommonUtils.toBean(req.getParameterMap(), static_user.class);*/
		List<static_user> userlist = userService.login();
		//System.out.println(user);
		if(userlist == null) {
			return "r:/bingo.jsp";
		} else {
			req.getSession().setAttribute("sessionNews", userlist);
			/*System.out.println(userlist);*/
		return "r:/bingo.jsp";
	}
	}
	
	/**
	 * 登录功能
	 */
	public String findSingleNews(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String SingleNews_id = req.getParameter("id");
		int id = Integer.parseInt(SingleNews_id);
		static_user SingleNews = userService.findSingleNews(id);
		if(SingleNews == null) {
			return "r:/news/html/1500.jsp";
		} else {
			req.getSession().setAttribute("SingleNews", SingleNews);
			/*System.out.println(userlist);*/
			return "r:/news/html/1500.jsp";
	}
	}

	/**
	 * 登录功能
	 */
	public String yuyuekance(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String SingleNews_id = req.getParameter("id");
		int id = Integer.parseInt(SingleNews_id);
		static_user SingleNews = userService.findSingleNews(id);
		if(SingleNews == null) {
			return "r:/news/html/1500.jsp";
		} else {
			req.getSession().setAttribute("SingleNews", SingleNews);
			/*System.out.println(userlist);*/
			return "r:/news/html/1500.jsp";
	}
	}
	
	
}
