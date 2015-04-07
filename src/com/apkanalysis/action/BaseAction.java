package com.apkanalysis.action;
import java.util.Map;


import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

//import com.myproject.dao.MusicDao;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 基本Action对象，其它Action的父�?
 * @author zenghuan
 */
public class BaseAction extends ActionSupport implements RequestAware,
SessionAware, ApplicationAware,Constants {
	private static final long serialVersionUID = 1L;
	protected int pageNo = 1;
	protected int pageSize = 10;
	// Map类型的request
	protected Map<String, Object> request;
	// Map类型的session
	protected Map<String, Object> session;
	// Map类型的application
	protected Map<String, Object> application;
	
	public void setRequest(Map<String, Object> request) {
		// 获取Map类型的request赋�?
		this.request = request;
	}
	public void setApplication(Map<String, Object> application) {
		// 获取Map类型的application赋�?
		this.application = application;
	}
	public void setSession(Map<String, Object> session) {
		// 获取Map类型的session赋�?
		this.session = session;
	}
	// 注入Dao
	@Autowired
	protected UserDao userDao;
	@Autowired
	protected NewsDao newsDao;
	@Autowired
	protected MusicDao musicDao;
	// 处理方法
	public String index() throws Exception {
		return INDEX;
	}
	public String userLogin() throws Exception {
		return USER_LOGIN;
	}
	public String adminLogin() throws Exception {
		return ADMIN_LOGIN;
	}
	public String userreg() throws Exception {
		return REG;
	}
	public String execute() throws Exception {
		return SUCCESS;
	}
	// getter和settter方法
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
}
