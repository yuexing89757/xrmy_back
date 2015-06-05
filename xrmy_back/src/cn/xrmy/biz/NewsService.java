package cn.xrmy.biz;

import java.util.List;

import cn.xrmy.pojo.News;
import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;


public interface NewsService {
	
	//商品查询列表
	public List<NewsCustom> findNewsList(NewsQueryVo newsQueryVo) throws Exception;
	
	//根据id查询商品信息
	public News findNewsById(Long id) throws Exception;
	
	//修改商品信息
	public void updateNews(Long id,NewsCustom newsCustom) throws Exception;
	
	//添加新闻信息
	public void addNews(News news) throws Exception;
	
	//删除新闻信息
	public void deleteByPrimaryKey(Long id) throws Exception;
	

}
