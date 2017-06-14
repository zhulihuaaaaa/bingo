package bingo.news.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
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
	public static_user findByLoginnameAndLoginpass() throws SQLException {
		String sql = "select * from bingo.news_info";
		return qr.query(sql, new BeanHandler<static_user>(static_user.class));
	}
	
	
}
