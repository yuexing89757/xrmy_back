package cn.xrmy.pojo;

import java.util.List;

/**
 * 
 * <p>Title: ItemsQueryVo</p>
 * <p>Description:商品包装对象 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-4-13下午3:22:36
 * @version 1.0
 */
public class NewsQueryVo {
	
	//商品信息
	private News news;
	
	//为了系统 可扩展性，对原始生成的po进行扩展
	private NewsCustom newsCustom;
	
	//批量商品信息
	private List<NewsCustom> newsList;

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public NewsCustom getNewsCustom() {
		return newsCustom;
	}

	public void setNewsCustom(NewsCustom newsCustom) {
		this.newsCustom = newsCustom;
	}

	public List<NewsCustom> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<NewsCustom> newsList) {
		this.newsList = newsList;
	}
	
	
	

}
