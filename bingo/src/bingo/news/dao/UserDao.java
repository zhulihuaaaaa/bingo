package bingo.news.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import bingo.news.domain.static_user;
import cn.itcast.jdbc.TxQueryRunner;

/**
 * 用户模块持久层
 * @author zhulihua
 *
 */
public class UserDao {
	private QueryRunner qr = new TxQueryRunner();
	

	/**
	 * 按用户名和密码查询
	 */
	public  List<static_user> findByLoginnameAndLoginpass() throws SQLException {
		String sql = "select * from bingo.news_info";
		List<static_user> list = qr.query(sql, new BeanListHandler<static_user>(static_user.class));
		for(int i=0;i<list.size();i++){
			String txtcontent = list.get(i).getNewsContent();
		    String content = txtcontent.replaceAll("</?[^>]+>", ""); //剔出<html>的标签  
		    content = content.replaceAll("<a>\\s*|\t|\r|\n</a>", "");//去除字符串中的空格,回车,换行符,制表符  
		    list.get(i).setNewsContent(content);
		}
		return list;
	}
	
	/**
	 * 按用户名和密码查询
	 */
	public  static_user findSingleNews(int id) throws SQLException {
			String sql = "select * from bingo.news_info where newsId = ?";
			static_user user = qr.query(sql, new BeanHandler<static_user>(static_user.class),id);
		return user;
	}
	
	/**
	 * 按用户名和密码查询
	 */
	public  static_user yuyuekance(int id) throws SQLException {
			String sql = "select * from bingo.news_info where newsId = ?";
			static_user user = qr.query(sql, new BeanHandler<static_user>(static_user.class),id);
		return user;
	}
}
