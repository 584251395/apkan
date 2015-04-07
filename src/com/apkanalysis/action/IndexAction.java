package com.apkanalysis.action;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

//import com.myproject.model.News;

@Scope("prototype")
@Controller("indexAction")
public class IndexAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private int maxResult=20;
	public String execute() throws Exception {
		Map<String, String> newsby = new HashMap<String, String>(1);//新闻定义Map集合
		newsby.put("newsdate", "desc");
		news=newsDao.BrefList(0,maxResult);
		return SUCCESS;
	}
	private List<News> news;//�?��新闻
	/**
	 * @return the news
	 */
	public List<News> getNews() {
		return news;
	}
	/**
	 * @param news the news to set
	 */
	public void setNews(List<News> news) {
		this.news = news;
	}
	
}
