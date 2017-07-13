package bingo.news.service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.List;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;

import cn.itcast.commons.CommonUtils;
import bingo.news.dao.UserDao;
import bingo.news.domain.static_user;
import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;

/**
 * 用户模块业务层
 * @author zhulihua
 *
 */
public class UserService {
	private UserDao userDao = new UserDao();
	
	/**
	 * 登录功能
	 * @param user
	 * @return
	 */
	public List<static_user> login() {
		try {
			return userDao.findByLoginnameAndLoginpass();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 登录功能
	 * @param user
	 * @return
	 */
	public static_user findSingleNews(int id) {
		try {
			return userDao.findSingleNews(id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static_user yuyuekance(int id) {
		try {
			return userDao.findSingleNews(id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
