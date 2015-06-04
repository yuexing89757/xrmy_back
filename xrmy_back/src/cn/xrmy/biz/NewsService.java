package cn.xrmy.biz;

import java.util.List;

import cn.xrmy.pojo.News;
import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;


public interface NewsService {
	
	//商品查询列表
	public List<NewsCustom> findNewsList(NewsQueryVo newsQueryVo) throws Exception;
	
	//根据id查询商品信息
	/**
	 * 
	 * <p>Title: findItemsById</p>
	 * <p>Description: </p>
	 * @param id 查询商品的id
	 * @return
	 * @throws Exception
	 */
	public News findNewsById(Long id) throws Exception;
	
	//修改商品信息
	/**
	 * 
	 * <p>Title: updateItems</p>
	 * <p>Description: </p>
	 * @param id 修改商品的id
	 * @param itemsCustom 修改的商品信息
	 * @throws Exception
	 */
	public void updateNews(Long id,NewsCustom newsCustom) throws Exception;
	

}
